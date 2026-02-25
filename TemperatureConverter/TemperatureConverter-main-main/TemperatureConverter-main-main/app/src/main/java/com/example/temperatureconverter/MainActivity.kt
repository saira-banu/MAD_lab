package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTemperature = findViewById<EditText>(R.id.editTemperature)
        val btnToCelsius = findViewById<Button>(R.id.btnToCelsius)
        val btnToFahrenheit = findViewById<Button>(R.id.btnToFahrenheit)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        // Convert to Celsius
        btnToCelsius.setOnClickListener {
            val input = editTemperature.text.toString()

            if (input.isEmpty()) {
                Toast.makeText(this, "Please enter temperature", Toast.LENGTH_SHORT).show()
            } else {
                val fahrenheit = input.toDouble()
                val celsius = (fahrenheit - 32) * 5 / 9
                txtResult.text = "Celsius: %.2f °C".format(celsius)
            }
        }

        // Convert to Fahrenheit
        btnToFahrenheit.setOnClickListener {
            val input = editTemperature.text.toString()

            if (input.isEmpty()) {
                Toast.makeText(this, "Please enter temperature", Toast.LENGTH_SHORT).show()
            } else {
                val celsius = input.toDouble()
                val fahrenheit = (celsius * 9 / 5) + 32
                txtResult.text = "Fahrenheit: %.2f °F".format(fahrenheit)
            }
        }
    }
}