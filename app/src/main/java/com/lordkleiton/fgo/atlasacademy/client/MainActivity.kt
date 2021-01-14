package com.lordkleiton.fgo.atlasacademy.client

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.ApiRequestHandler
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
                val result = ApiRequestHandler.get<BasicServant>()

                if (result != null) {
                    Toast.makeText(baseContext, result.toString(), Toast.LENGTH_SHORT).show()
                }

                val r2 = ApiRequestHandler.find<BasicServant>()

                r2?.forEach { Log.i("hmm", it.toString()) }
            }
        }
    }
}