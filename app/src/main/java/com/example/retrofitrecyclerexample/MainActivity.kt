package com.example.retrofitrecyclerexample

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.retrofitrecyclerexample.Adapter.EmployeesAdapter
import kotlinx.android.synthetic.main.activity_main.*

import java.util.ArrayList

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var employeeList: ArrayList<Employee>? = null
    private var pDialog: ProgressDialog? = null
    private var eAdapter: EmployeesAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pDialog = ProgressDialog(this@MainActivity)
        pDialog!!.setMessage("Loading Data.. Please wait...")
        pDialog!!.isIndeterminate = false
        pDialog!!.setCancelable(false)
        pDialog!!.show()


        val api = RetroClient.apiService
        val call = api.myJSON


        call.enqueue(object : Callback<EmployeeList> {
            override fun onResponse(call: Call<EmployeeList>, response: Response<EmployeeList>) {
                //Dismiss Dialog
                pDialog!!.dismiss()

                if (response.isSuccessful) {
                    employeeList = response.body().employee
                    eAdapter = EmployeesAdapter(employeeList!!)
                    val eLayoutManager = LinearLayoutManager(applicationContext)
                    recycler_view!!.layoutManager = eLayoutManager
                    recycler_view!!.itemAnimator = DefaultItemAnimator()
                    recycler_view!!.adapter = eAdapter
                }
            }

            override fun onFailure(call: Call<EmployeeList>, t: Throwable) {
                pDialog!!.dismiss()
            }
        })
    }
}
