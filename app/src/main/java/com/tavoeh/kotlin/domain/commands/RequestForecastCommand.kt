package com.tavoeh.kotlin.domain.commands

import com.tavoeh.kotlin.data.ForecastRequest
import com.tavoeh.kotlin.domain.mappers.ForecastDataMapper
import com.tavoeh.kotlin.domain.model.ForecastList

/**
 * Created by tavoeh on 8/02/2017.
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }

}