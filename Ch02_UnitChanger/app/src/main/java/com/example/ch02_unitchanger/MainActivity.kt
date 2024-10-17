package com.example.ch02_unitchanger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.ch02_unitchanger.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var outputTextView = binding.textOutput
        val outputUnitTextView = binding.textOutputUnit
        val inputEditText = binding.textInput
        val inputUnitTextView = binding.textInputUnit
        val buttonConverter = binding.buttonUnitConverter
        var inputNum: Long = 0
        var cmToM = true

        inputEditText.addTextChangedListener { text ->
            inputNum = if (text.isNullOrEmpty()) {
                0
            } else {
                text.toString().toLong()
            }
            if (cmToM) {
                outputTextView.text = inputNum.times(0.01).toString()
            } else {
                outputTextView.text = inputNum.times(100).toString()
            }

        }

        buttonConverter.setOnClickListener {
//            cmToM = cmToM.not()
            cmToM = !cmToM
            if (cmToM) {
                inputUnitTextView.text = "cm"
                outputUnitTextView.text = "m"
                outputTextView.text = inputNum.times(0.01).toString()
            } else {
                inputUnitTextView.text = "m"
                outputUnitTextView.text = "cm"
                outputTextView.text = inputNum.times(100).toString()
            }
        }
    }
}