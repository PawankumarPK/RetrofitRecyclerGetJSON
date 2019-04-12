package com.example.retrofitrecyclerexample

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.util.ArrayList

class EmployeeList {

    @SerializedName("employee")
    @Expose
    var employee: ArrayList<Employee>? = null

}
