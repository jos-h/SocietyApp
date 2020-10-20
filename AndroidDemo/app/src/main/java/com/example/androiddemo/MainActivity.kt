package com.example.androiddemo

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    @SuppressLint("WrongViewCast", "ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "After on click action")

        // Getting intent data
        val bundle: Bundle? = intent.extras
        val string = bundle?.getString("username")
        username.text = string
        txtViewFlatNumber.text = bundle?.getString("FlatNo")
    }

    fun showDues(view: View){
        Toast.makeText(this, "Dues Clicked!!!!", Toast.LENGTH_SHORT).show()
    }

    fun showVisitors(view: View) {
        Toast.makeText(this, "Visitors Clicked !!!!", Toast.LENGTH_SHORT).show()
    }

    fun showHelpDesk(view: View) {
        Toast.makeText(this, "HelpDesk Clicked!!!!", Toast.LENGTH_SHORT).show()
    }

    fun showDirectory(view: View) {
        Toast.makeText(this, "Directory Clicked!!!!", Toast.LENGTH_SHORT).show()
    }

    fun showParkingDetails(view: View) {
        Toast.makeText(this, "Parking Clicked!!!!", Toast.LENGTH_SHORT).show()
    }
}