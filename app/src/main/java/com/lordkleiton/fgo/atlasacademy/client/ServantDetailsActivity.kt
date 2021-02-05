package com.lordkleiton.fgo.atlasacademy.client

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
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
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_ID
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION_NA
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_SERVANT_ID
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.JAPANESE_OPENING_PARENTHESIS
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.NEW_JAPANESE_OPENING_PARENTHESIS
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.RATIO_SERVANT_PORTRAIT
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

    private lateinit var mediaPlayer: MediaPlayer

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

        mediaPlayer = MediaPlayer()

        progress = findViewById(R.id.list_item_audio_player_progress)

        playbtn = findViewById(R.id.list_item_audio_player_button)

        voicesRV = findViewById(R.id.servant_details_rv_voices)
    }

    private fun setupAdapters() {
        skillListAdapter = SkillListAdapter(baseContext)
        skillsRV.adapter = skillListAdapter

        portraitListAdapter = ImageListAdapter(baseContext, width, height)
        portraitsRV.adapter = portraitListAdapter

        voicesListAdapter = NiceVoiceGroupListAdapter(baseContext)
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

        //playAudio()
    }

    private fun setupVoices() {
        if (nice.profile.voices.isNotEmpty()) {
            voicesListAdapter.submitList(nice.profile.voices)
        }
    }

    private fun playAudio() {
        if (nice.profile.voices.isNotEmpty()) {
            val url = nice.profile.voices.first().voiceLines.first().audioAssets.first()

            mediaPlayer.apply {
                setAudioAttributes(
                    AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
                )
                setDataSource(url)

                prepareAsync()

                setOnPreparedListener { mp ->
                    mp.start()

                    progress.post(mUpdateTime)
                }
            }


        }
    }

    private val mUpdateTime: Runnable = object : Runnable {
        override fun run() {
            if (mediaPlayer.isPlaying) {
                playbtn.setImageDrawable(AppCompatResources.getDrawable(baseContext,
                    R.drawable.ic_baseline_pause_24))

                val currentDuration =
                    (mediaPlayer.currentPosition * 100) / mediaPlayer.duration + 1

                progress.progress = currentDuration

                progress.postDelayed(this, 1)
            } else {
                playbtn.setImageDrawable(AppCompatResources.getDrawable(baseContext,
                    R.drawable.ic_baseline_play_arrow_24))
            }
        }
    }

    override fun onPause() {
        progress.removeCallbacks(mUpdateTime)

        mediaPlayer.release()

        super.onPause()
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
}