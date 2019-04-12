package com.example.retrofitrecyclerexample

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Employee {

    @SerializedName("employee_id")
    @Expose
    var employeeId: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("dob")
    @Expose
    var dob: String? = null

    @SerializedName("designation")
    @Expose
    var designation: String? = null

    @SerializedName("contact_number")
    @Expose
    var contactNumber: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("salary")
    @Expose
    var salary: String? = null

}
