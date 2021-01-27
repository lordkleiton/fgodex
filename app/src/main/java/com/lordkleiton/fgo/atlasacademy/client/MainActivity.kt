package com.lordkleiton.fgo.atlasacademy.client

import android.content.Intent
import android.os.Bundle
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.BasicServantListAdapter
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.listener.OnListItemClickListener
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION_JP
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION_NA
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_SERVANT_ID
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
class MainActivity : AppCompatActivity() {
    private lateinit var adapter: BasicServantListAdapter
    private lateinit var rv: RecyclerView
    private lateinit var rg: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupComponents()

        setupAdapter()

        loadServantsNA()

        setupRadio()
    }

    private fun setupComponents() {
        rv = findViewById(R.id.main_lv)
        rg = findViewById(R.id.main_radio_group)
    }

    private fun setupAdapter() {
        adapter = BasicServantListAdapter(baseContext,
            mutableListOf(),
            object : OnListItemClickListener {
                override fun onItemClick(servant: BasicServant, position: Int) {
                    val intent = Intent(baseContext, ServantDetailsActivity::class.java).apply {
                        putExtra(EXTRA_SERVANT_ID, servant.collectionNo)
                        putExtra(EXTRA_REGION, when (rg.checkedRadioButtonId) {
                            R.id.main_radio_na -> EXTRA_REGION_NA
                            else -> EXTRA_REGION_JP
                        })
                    }

                    startActivity(intent)
                }
            }
        )

        rv.adapter = adapter
    }

    private fun loadServantsJP() {
        GlobalScope.launch(Dispatchers.Main) {
            RequestsRepository.basic.findAllServantEnglishName()?.forEach { adapter.add(it) }
        }
    }

    private fun loadServantsNA() {
        GlobalScope.launch(Dispatchers.Main) {
            RequestsRepository.basic.findAllServant()?.forEach { adapter.add(it) }
        }
    }

    private fun setupRadio() {
        rg.setOnCheckedChangeListener { _, i: Int ->
            adapter.clear()

            when (i) {
                R.id.main_radio_na -> loadServantsNA()
                R.id.main_radio_jp -> loadServantsJP()
            }
        }
    }
}
