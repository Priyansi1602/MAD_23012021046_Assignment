package com.example.mobiletripcapture

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_23012021046_assignment.R

class TripDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip_details)

        val modeSpinner: Spinner = findViewById(R.id.spinnerMode)
        val purposeSpinner: Spinner = findViewById(R.id.spinnerPurpose)
        val companionsEt: EditText = findViewById(R.id.etCompanions)
        val costEt: EditText = findViewById(R.id.etCost)
        val btnSave: Button = findViewById(R.id.btnSaveTrip)

        val modes = listOf("Bus", "Car", "Bike", "Walk", "Train")
        val purposes = listOf("Work", "Education", "Shopping", "Leisure", "Other")
        modeSpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, modes)
        purposeSpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, purposes)

        btnSave.setOnClickListener {
            android.widget.Toast.makeText(this, "Trip saved (UI only)", android.widget.Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, ViewTripsActivity::class.java))
        }
    }
}

