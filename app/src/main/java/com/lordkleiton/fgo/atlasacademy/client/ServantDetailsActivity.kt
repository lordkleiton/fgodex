package com.lordkleiton.fgo.atlasacademy.client

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.app.dao.BasicServantDAO
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
    private lateinit var primaryName: TextView
    private lateinit var secondaryName: TextView
    private lateinit var skillsRV: RecyclerView
    private lateinit var skillListAdapter: SkillListAdapter

    private lateinit var nice: NiceServant
    private var basic: BasicServant? = null
    private var region: EnumRegion = DEFAULT_REGION
    private var id = DEFAULT_ID

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servant_details)

        setupActionBar()

        setupViews()

        setupExtras()

        setupAdapter()

        loadServant()
    }

    private fun setupActionBar() {
        title = "Details"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupViews() {
        primaryName = findViewById(R.id.servant_details_primary_name)

        secondaryName = findViewById(R.id.servant_details_secondary_name)

        skillsRV = findViewById(R.id.servant_details_rv)
    }

    private fun setupAdapter() {
        skillListAdapter = SkillListAdapter(baseContext)

        skillsRV.adapter = skillListAdapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) finish()

        return super.onOptionsItemSelected(item)
    }

    private fun setupExtras() {
        val string = intent.getStringExtra(EXTRA_REGION) ?: EXTRA_REGION_NA

        region = findEnumByName<EnumRegion>(string) ?: DEFAULT_REGION

        id = intent.getIntExtra(EXTRA_SERVANT_ID, DEFAULT_ID)
    }

    private fun loadServant() {
        GlobalScope.launch(Dispatchers.Main) {
            val result = NiceServantDAO.get(id, region)

            if (result != null) {
                onLoadSuccess(result)
            } else {
                onLoadFailure()
            }
        }
    }

    private fun onLoadSuccess(servant: NiceServant) {
        nice = servant

        primaryName.text = nice.name

        skillListAdapter.submitList(nice.skills)

        basic = BasicServantDAO.get(nice.id, region)?.apply {
            secondaryName.text = name

            if (region == EnumRegion.NA) secondaryName.visibility = View.GONE
        }
    }

    private fun onLoadFailure() {
        val msg = "deu ruim UwU"

        Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
    }
}