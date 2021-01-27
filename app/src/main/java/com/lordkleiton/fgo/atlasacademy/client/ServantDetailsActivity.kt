package com.lordkleiton.fgo.atlasacademy.client

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.util.ApiUtils
import com.lordkleiton.fgo.atlasacademy.client.app.dao.NiceServantDAO
import kotlinx.coroutines.Dispatchers
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

        title = "espera aí...."
    }

    private fun setupBasicServant() {
        val extra = intent.getStringExtra("servant")

        if (extra != null) {
            basicServant = ApiUtils.globalJson.decodeFromString(BasicServant.serializer(),
                extra)
        }
    }

    private fun loadNiceServant() {
        GlobalScope.launch(Dispatchers.Main) {
            val result = NiceServantDAO.getServant(basicServant.id)

            if (result != null) {
                niceServant = result

                title = result.name
            }
        }
    }
}