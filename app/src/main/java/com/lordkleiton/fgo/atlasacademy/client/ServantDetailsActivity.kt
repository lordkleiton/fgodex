package com.lordkleiton.fgo.atlasacademy.client

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.app.dao.NiceServantDAO
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.SkillListAdapter
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_ID
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION_NA
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_SERVANT_ID
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ServantDetailsActivity : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var rv: RecyclerView
    private lateinit var adapter: SkillListAdapter

    private lateinit var niceServant: NiceServant
    private var region: EnumRegion = DEFAULT_REGION
    private var id = DEFAULT_ID


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servant_details)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        title = "OwO espera aí...."

        setupViews()

        setupExtras()

        setupAdapter()

        loadServant()
    }

    private fun setupViews() {
        text = findViewById(R.id.servant_details_text)
        rv = findViewById(R.id.servant_details_rv)
    }

    private fun setupAdapter() {
        adapter = SkillListAdapter(baseContext)

        rv.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) finish()

        return super.onOptionsItemSelected(item)
    }

    private fun setupExtras() {
        val string = intent.getStringExtra(EXTRA_REGION) ?: EXTRA_REGION_NA

        region = findEnumByName<EnumRegion>(string) ?: region

        id = intent.getIntExtra(EXTRA_SERVANT_ID, DEFAULT_ID)
    }

    private fun loadServant() {
        GlobalScope.launch(Dispatchers.Main) {
            val result = NiceServantDAO.get(id, region)

            if (result != null) {
                niceServant = result

                title = result.name

                val regex = """[\[\]]""".toRegex()
                val traits = result.traits.map { it.nameEnum }.toString()
                    .replace(regex, "").replace(",", "\n")

                text.text = traits

                adapter.submitList(niceServant.skills)

//                Glide.with(baseContext)
//                    .load(niceServant.extraAssets.charaGraph.ascension.toList().first().second)
//                    .into(iv)
            } else {
                val msg = "deu ruim UwU"

                title = msg

                Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
            }
        }
    }
}