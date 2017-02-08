package com.tavoeh.kotlin.screens.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.tavoeh.kotlin.R
import com.tavoeh.kotlin.domain.commands.RequestForecastCommand
import com.tavoeh.kotlin.screens.adapters.ForecastListAdapter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList : RecyclerView =  find(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)

        doAsync {
            val result = RequestForecastCommand("3008").execute()
            uiThread {
                forecastList.adapter = ForecastListAdapter(result);
            }
        }
    }



}
