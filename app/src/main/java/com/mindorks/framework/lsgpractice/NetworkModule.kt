package com.mindorks.framework.lsgpractice

import com.mindorks.RequestInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun bindAnalyticsService(): RequestInterface {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = (HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
        client.addInterceptor(loggingInterceptor)

        return Retrofit.Builder()
            .baseUrl("https://www.lucknowsupergiants.in/")
            .client(client.build())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RequestInterface::class.java)  // class.java will create an object
        // of requestinterface that will give sme properties and object

    }

    @Provides
    @Singleton
    fun bindCricketRepository(RequestInterface: RequestInterface): StandingRepository {
        return StandingRepository(RequestInterface)
    }

}