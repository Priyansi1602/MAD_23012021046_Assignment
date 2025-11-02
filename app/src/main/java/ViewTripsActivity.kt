package com.example.mobiletripcapture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_23012021046_assignment.R

class ViewTripsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_trips)
        val rv = findViewById<RecyclerView>(R.id.rvTrips)
        rv.layoutManager = LinearLayoutManager(this)
        val sample = listOf(
            Triple("Trip #1 - Bus","09:00 AM → 09:40 AM","Distance: 12 km | Cost: ₹40"),
            Triple("Trip #2 - Walk","10:30 AM → 10:50 AM","Distance: 2 km | Cost: ₹0"),
            Triple("Trip #3 - Car","18:10 → 18:50","Distance: 15 km | Cost: ₹120")
        )
        rv.adapter = object : RecyclerView.Adapter<ViewTripsActivity.TripVH>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripVH {
                val v = LayoutInflater.from(parent.context).inflate(R.layout.item_trip, parent, false)
                return TripVH(v)
            }
            override fun onBindViewHolder(holder: TripVH, position: Int) {
                val (t1,t2,t3) = sample[position]
                holder.title.text = t1
                holder.time.text = t2
                holder.meta.text = t3
            }
            override fun getItemCount(): Int = sample.size
        }
    }
    class TripVH(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.tvTripTitle)
        val time: TextView = view.findViewById(R.id.tvTripTime)
        val meta: TextView = view.findViewById(R.id.tvTripMeta)
    }
}
