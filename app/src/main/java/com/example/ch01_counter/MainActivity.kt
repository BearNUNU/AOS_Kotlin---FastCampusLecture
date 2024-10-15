package com.example.ch01_counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textCount = findViewById<TextView>(R.id.textCount)
        val buttonReset = findViewById<Button>(R.id.buttonReset)
        val buttonPlus = findViewById<Button>(R.id.buttonPlus)
        var count = 0
        buttonReset.setOnClickListener {
            count = 0
            textCount.text = count.toString()
        }
        buttonPlus.setOnClickListener {
            count++
            textCount.text = count.toString()
        }
    }
}
