package com.tavoeh.kotlin

import android.util.Log
import java.net.URL

/**
 * Created by tavoeh on 8/02/2017.
 */
class Request (val url: String){

    fun run (){
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}