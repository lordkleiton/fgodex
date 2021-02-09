package com.lordkleiton.fgo.atlasacademy.client

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.app.dao.BasicServantDAO
import com.lordkleiton.fgo.atlasacademy.client.app.dao.NiceServantDAO
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.ImageListAdapter
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.NiceVoiceGroupListAdapter
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.SkillListAdapter
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.listener.OnVoicePlayButtonClickListener
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_ID
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION_NA
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_SERVANT_ID
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.JAPANESE_OPENING_PARENTHESIS
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.NEW_JAPANESE_OPENING_PARENTHESIS
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.RATIO_SERVANT_PORTRAIT
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppMediaPlayer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ServantDetailsActivity : AppCompatActivity() {
    private lateinit var primaryName: TextView
    private lateinit var secondaryName: TextView
    private lateinit var skillsRV: RecyclerView
    private lateinit var skillListAdapter: SkillListAdapter
    private lateinit var portraitsRV: RecyclerView
    private lateinit var portraitListAdapter: ImageListAdapter
    private lateinit var progress: LinearProgressIndicator
    private lateinit var playbtn: ImageButton
    private lateinit var voicesRV: RecyclerView
    private lateinit var voicesListAdapter: NiceVoiceGroupListAdapter

    private lateinit var nice: NiceServant
    private var basic: BasicServant? = null
    private var region: EnumRegion = DEFAULT_REGION
    private var id = DEFAULT_ID
    private val height = 300
    private val width = (height / RATIO_SERVANT_PORTRAIT).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servant_details)

        setupActionBar()

        setupViews()

        setupExtras()

        setupAdapters()

        loadServant()
    }

    private fun setupActionBar() {
        title = "Details"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupViews() {
        primaryName = findViewById(R.id.servant_details_primary_name)

        secondaryName = findViewById(R.id.servant_details_secondary_name)

        skillsRV = findViewById(R.id.servant_details_rv_skills)

        portraitsRV = findViewById(R.id.servant_details_rv_img)

        progress = findViewById(R.id.list_item_audio_player_progress)

        playbtn = findViewById(R.id.list_item_audio_player_button)

        voicesRV = findViewById(R.id.servant_details_rv_voices)
    }

    private fun setupAdapters() {
        skillListAdapter = SkillListAdapter(baseContext)
        skillsRV.adapter = skillListAdapter

        portraitListAdapter = ImageListAdapter(baseContext, width, height)
        portraitsRV.adapter = portraitListAdapter

        setupVoicesAdapter()
    }

    private fun setupVoicesAdapter() {
        voicesListAdapter =
            NiceVoiceGroupListAdapter(baseContext, object : OnVoicePlayButtonClickListener {
                override fun onItemClick(
                    view: NiceVoiceGroupListAdapter.NiceVoiceGroupViewAdapter,
                    pos: Int,
                ) {
                    voicesListAdapter.getViews().forEach { it.toPlay() }

                    val voice = voicesListAdapter.currentList[pos]

                    view.toggleButton()

                    val url = voice.voiceLines.first().audioAssets.first()

                    AppMediaPlayer.play(url) {
                        val delay = 1L

                        view.view.postDelayed(object : Runnable {

                            override fun run() {
                                if (AppMediaPlayer.isPlaying()) {
                                    view.updateProgress(AppMediaPlayer.getProgress())

                                    view.view.postDelayed(this, delay)
                                } else {
                                    view.toggleButton()

                                    view.updateProgress(0)
                                }
                            }

                        }, delay)
                    }
                }
            })

        voicesRV.adapter = voicesListAdapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) finish()

        return super.onOptionsItemSelected(item)
    }

    private fun setupExtras() {
        val string = intent.getStringExtra(EXTRA_REGION) ?: EXTRA_REGION_NA

        region = findEnumByName<EnumRegion>(string) ?: DEFAULT_REGION

        id = intent.getIntExtra(EXTRA_SERVANT_ID, DEFAULT_ID)
    }

    private fun loadServant() {
        GlobalScope.launch(Dispatchers.Main) {
            val result = NiceServantDAO.get(id, region)

            if (result != null) {
                onLoadSuccess(result)
            } else {
                onLoadFailure()
            }
        }
    }

    private suspend fun onLoadSuccess(servant: NiceServant) {
        nice = servant

        primaryName.text =
            nice.name.replace(JAPANESE_OPENING_PARENTHESIS, NEW_JAPANESE_OPENING_PARENTHESIS)

        skillListAdapter.submitList(nice.skills)

        basic = BasicServantDAO.complementaryServant(nice.id, region)?.apply {
            secondaryName.text = name
        }

        setupImages()

        setupVoices()
    }

    private fun setupVoices() {
        if (nice.profile.voices.isNotEmpty()) {
            voicesListAdapter.submitList(nice.profile.voices)
        }
    }

    private fun setupImages() {
        val list = mutableListOf<String>()

        list.addAll(nice.extraAssets.charaGraph.ascension.map { it.value })
        list.addAll(nice.extraAssets.charaGraph.costume.map { it.value })

        portraitListAdapter.submitList(list)
    }

    private fun onLoadFailure() {
        val msg = "deu ruim UwU"

        Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        AppMediaPlayer.stopPlayer()

        super.onPause()
    }
}