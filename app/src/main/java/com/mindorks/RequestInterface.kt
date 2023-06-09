package com.mindorks


import com.mindorks.framework.lsgpractice.ui.framework.main.standingmodel.StandingResponse
import retrofit2.Response
import retrofit2.http.GET

interface RequestInterface {
    @GET("cricket/live/json/standing_5157.json")
    suspend fun getstandinglist() : Response<StandingResponse>
}