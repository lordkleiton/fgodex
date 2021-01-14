package com.lordkleiton.fgo.atlasacademy.client

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.ExperimentalSerializationApi

class MainActivity : AppCompatActivity() {
    @ExperimentalSerializationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            GlobalScope.launch(Dispatchers.Main) {
                val r = RequestsRepository.nice.getServant()

                if (r != null)
                    Log.i("hmm", r.toString())
            }
        }
    }
}