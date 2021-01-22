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
    private lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupComponents()

        setupAdapter()

        loadServants()
    }

    private fun setupComponents() {
        rv = findViewById(R.id.main_lv)
    }

    private fun setupAdapter() {
        adapter = BasicServantListAdapter(baseContext, mutableListOf())

        rv.adapter = adapter
    }

    private fun loadServants() {
        GlobalScope.launch(Dispatchers.Main) {
            RequestsRepository.basic.findAllServant()?.forEach { adapter.add(it) }
        }
    }
}
