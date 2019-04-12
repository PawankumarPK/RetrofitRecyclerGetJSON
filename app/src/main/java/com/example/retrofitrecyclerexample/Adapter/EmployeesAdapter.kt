package com.example.retrofitrecyclerexample.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


import com.example.retrofitrecyclerexample.Employee
import com.example.retrofitrecyclerexample.R

class EmployeesAdapter(private val employees: List<Employee>) : RecyclerView.Adapter<EmployeesAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.employee_list, parent, false)
        return CustomViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val employee = employees[position]
        holder.employeeName.text = employee.name
        holder.email.text = employee.email
        holder.designation.text = employee.designation
        holder.salary.text = employee.salary
        holder.dob.text = employee.dob
        holder.contactNumber.text = employee.contactNumber
    }

    override fun getItemCount(): Int {
        return employees.size
    }

    inner class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var employeeName: TextView
        var designation: TextView
        var email: TextView
        var salary: TextView
        var dob: TextView
        var contactNumber: TextView

        init {
            employeeName = view.findViewById<View>(R.id.employeeName) as TextView
            email = view.findViewById<View>(R.id.email) as TextView
            designation = view.findViewById<View>(R.id.designation) as TextView
            salary = view.findViewById<View>(R.id.salary) as TextView
            dob = view.findViewById<View>(R.id.dob) as TextView
            contactNumber = view.findViewById<View>(R.id.contactNumber) as TextView
        }
    }
}