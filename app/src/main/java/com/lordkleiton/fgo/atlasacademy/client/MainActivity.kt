package com.lordkleiton.fgo.atlasacademy.client

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.BasicServantListAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
class MainActivity : AppCompatActivity() {
    private lateinit var adapter: BasicServantListAdapter
    private lateinit var fba: FloatingActionButton
    private lateinit var rv: RecyclerView
    private var index = 1
    private val paging = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupComponents()

        setupAdapter()

        if (index < paging) loadServant()

        fba.setOnClickListener {
            loadServant()
        }
    }

    private fun setupComponents() {
        fba = findViewById(R.id.btn)
        rv = findViewById(R.id.main_lv)
    }

    private fun setupAdapter() {
        adapter = BasicServantListAdapter(baseContext, mutableListOf())

        rv.adapter = adapter
    }

    private fun loadServant() {
        GlobalScope.launch(Dispatchers.Main) {
            for (i in 1..paging) {

                val r = RequestsRepository.basic.getServant(id = index)

                if (r != null) {
                    adapter.add(r)
                } else {
                    fba.hide()
                }

                index++
            }
        }
    }
}
