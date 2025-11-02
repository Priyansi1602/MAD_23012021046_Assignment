package com.example.mobiletripcapture

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_23012021046_assignment.R

class StartTripActivity : AppCompatActivity() {
    private var tripStarted = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_trip)
        val btnStart = findViewById<Button>(R.id.btnStart)
        val btnEnd = findViewById<Button>(R.id.btnEnd)
        val tvStatus = findViewById<TextView>(R.id.tvTripStatus)
        val tvDestination = findViewById<TextView>(R.id.tvDestination)

        btnStart.setOnClickListener {
            tripStarted = true
            tvStatus.text = "Trip started at 09:00 AM (dummy)"
            android.widget.Toast.makeText(this, "Trip started!", android.widget.Toast.LENGTH_SHORT).show()
        }

        btnEnd.setOnClickListener {
            if (!tripStarted) {
                android.widget.Toast.makeText(this, "Start trip first", android.widget.Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            tvStatus.text = "Trip ended at 09:40 AM (dummy)"
            tvDestination.text = "Destination: 23.05, 72.05 (dummy)"
            android.widget.Toast.makeText(this, "Trip ended! Please fill details.", android.widget.Toast.LENGTH_SHORT).show()
            // Navigate to details screen
            startActivity(Intent(this, TripDetailsActivity::class.java))
        }
    }
}
