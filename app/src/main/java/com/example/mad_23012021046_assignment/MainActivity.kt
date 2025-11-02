package com.example.mobiletripcapture

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_23012021046_assignment.R
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialCardView>(R.id.cardStart).setOnClickListener {
            startActivity(Intent(this, StartTripActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardViewTrips).setOnClickListener {
            startActivity(Intent(this, ViewTripsActivity::class.java))
        }
        findViewById<Button>(R.id.btnSummary).setOnClickListener {
            // UI-only app: show simple message
            android.widget.Toast.makeText(this, "Summary screen (UI-only)", android.widget.Toast.LENGTH_SHORT).show()
        }
    }
}
