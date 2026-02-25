package com.example.components   // change if your package name is different

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.btnChange)

        button.setOnClickListener {

            // Change text color
            textView.setTextColor(Color.RED)

            // Change text style
            textView.setTypeface(null, Typeface.BOLD_ITALIC)

            // Show Toast
            Toast.makeText(this, "Text Style Changed!", Toast.LENGTH_SHORT).show()
        }
    }
}