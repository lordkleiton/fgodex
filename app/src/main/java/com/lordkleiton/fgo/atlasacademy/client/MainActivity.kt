package com.lordkleiton.fgo.atlasacademy.client

import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.ApiRequestHandler
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.Main) {
            val result = withContext(Dispatchers.Default) {
                ApiRequestHandler.get<BasicServant>()
            }

            Toast.makeText(baseContext, result.toString(), Toast.LENGTH_LONG).show()
        }
    }
}