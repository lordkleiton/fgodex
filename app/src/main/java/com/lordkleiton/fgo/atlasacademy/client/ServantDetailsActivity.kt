package com.lordkleiton.fgo.atlasacademy.client

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.util.ApiUtils
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ServantDetailsActivity : AppCompatActivity() {
    lateinit var basicServant: BasicServant
    lateinit var niceServant: NiceServant

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servant_details)

        setupBasicServant()

        loadNiceServant()

        title = basicServant.name
    }

    private fun setupBasicServant() {
        val extra = intent.getStringExtra("servant")

        if (extra != null) {
            basicServant = ApiUtils.globalJson.decodeFromString(BasicServant.serializer(),
                extra)
        }
    }

    private fun loadNiceServant() {
        GlobalScope.launch {
            val result = RequestsRepository.nice.getServant(id = basicServant.id)

            if (result != null) {
                niceServant = result

                Log.i("hmm", niceServant.extraAssets.toString())
            }
        }
    }
}