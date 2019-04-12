package com.example.retrofitrecyclerexample

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @get:GET("retrofit/json_object.json")
    val myJSON: Call<EmployeeList>
}
