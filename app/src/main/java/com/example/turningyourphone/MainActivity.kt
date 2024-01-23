package com.example.turningyourphone

import android.content.res.Configuration
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

        var textView = findViewById<TextView>(R.id.textView)
        var buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        var text = "This Is "

        buttonSubmit.setOnClickListener {
            if (buttonSubmit.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
                text += "Portrait Mode"
            else
                text += "Landscape Mode"
            textView.setText(text)
        }
    }
}