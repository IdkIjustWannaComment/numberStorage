package com.example.numberstorage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // MUST come before findViewById
        setContentView(R.layout.activity_main)

        // Connect Kotlin to XML views
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val editTextNumberInput =
            findViewById<EditText>(R.id.editTextNumberInput)

        val numbers = IntArray(10)
        var index = 0

        btnAdd.setOnClickListener {

            if (index < 10) {

                val number =
                    editTextNumberInput.text.toString().toInt()

                numbers[index] = number

                index++
            }
        }
    }
}