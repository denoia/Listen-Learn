package com.example.listenlearn

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // You can add any logic or UI elements you want in this activity
        // For example, you can display a welcome message
        val welcomeText = findViewById<TextView>(R.id.welcome_text)
        welcomeText.text = ""
    }
}