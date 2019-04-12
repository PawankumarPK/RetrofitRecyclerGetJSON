package com.example.retrofitrecyclerexample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroClient {

    private val ROOT_URL = "http://api.androiddeft.com/"

    private val retrofitInstance = Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

    //val apiService: ApiService
    val apiService = retrofitInstance.create(ApiService::class.java)
}
