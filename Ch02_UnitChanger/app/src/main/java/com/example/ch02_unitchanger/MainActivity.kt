package com.example.ch02_unitchanger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ch02_unitchanger.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val outputTextView = binding.textOutput
        val outputUnitTextView = binding.textOutputUnit
        val inputEditText = binding.textInput
        val inputUnitTextView = binding.textInputUnit
        val buttonConverter = binding.buttonUnitConverter
        var inputNum = 0
    }
}
