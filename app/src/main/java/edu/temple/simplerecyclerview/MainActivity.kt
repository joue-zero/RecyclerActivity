package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //TODO Step 2: Provide a LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        //TODO Step 4: Provide a RecyclerView.Adapter

        // make array of multiple of fives and remove the zero
        val numbers = IntArray(20) { (it+1) * 5 }
        recyclerView.adapter = NumberDisplayAdapter(numbers)

    }
}