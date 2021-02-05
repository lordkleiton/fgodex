package com.lordkleiton.fgo.atlasacademy.client

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.app.dao.BasicServantDAO
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.BasicServantListAdapter
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.listener.OnListItemClickListener
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION_JP
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_REGION_NA
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.EXTRA_SERVANT_ID
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: BasicServantListAdapter
    private lateinit var rv: RecyclerView
    private lateinit var tl: TabLayout
    private var region = DEFAULT_REGION

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupComponents()

        setupAdapter()

        loadServantsNA()

        setupTabs()
    }

    private fun setupComponents() {
        title = "Servants"

        rv = findViewById(R.id.main_lv)
        tl = findViewById(R.id.main_tab)
    }

    private fun setupAdapter() {
        adapter = BasicServantListAdapter(baseContext,
            mutableListOf(),
            object : OnListItemClickListener {
                override fun onItemClick(servant: BasicServant, position: Int) {
                    val intent = Intent(baseContext, ServantDetailsActivity::class.java).apply {
                        putExtra(EXTRA_SERVANT_ID, servant.id)
                        putExtra(EXTRA_REGION, when (region) {
                            EnumRegion.NA -> EXTRA_REGION_NA
                            EnumRegion.JP -> EXTRA_REGION_JP
                        })
                    }

                    startActivity(intent)
                }

                override fun onItemLongClick(servant: BasicServant, position: Int) {
                    GlobalScope.launch(Dispatchers.Main) {
                        val other = BasicServantDAO.complementaryServant(servant.id, region)
                        val msg = "${servant.name} | ${other?.name}"

                        Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        )

        rv.adapter = adapter
    }

    private fun loadServantsJP() {
        region = EnumRegion.JP

        loadServants(region)
    }

    private fun loadServantsNA() {
        region = EnumRegion.NA

        loadServants(region)
    }

    private fun loadServants(region: EnumRegion) {
        GlobalScope.launch(Dispatchers.Main) {
            BasicServantDAO.find(region).forEach { adapter.add(it) }
        }
    }

    private fun setupTabs() {
        tl.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                rv.smoothScrollToPosition(0)
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.position.apply {
                    adapter.clear()

                    when (this) {
                        0 -> loadServantsNA()
                        else -> loadServantsJP()
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
        })
    }
}
