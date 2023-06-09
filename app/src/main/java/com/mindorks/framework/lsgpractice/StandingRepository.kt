package com.mindorks.framework.lsgpractice

import com.mindorks.RequestInterface

import com.mindorks.framework.lsgpractice.ui.framework.main.standingmodel.StandingResponse
import retrofit2.Response


class StandingRepository(val service : RequestInterface) {

    suspend fun getlist(): Response<StandingResponse> {
        return service.getstandinglist()
    }


}