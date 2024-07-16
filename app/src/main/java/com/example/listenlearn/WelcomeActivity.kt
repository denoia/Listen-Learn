package com.example.listenlearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listenlearn.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // You can access views directly using the binding object
        binding.logo.setImageResource(R.drawable.ic_logo)
        binding.welcomeText.text = "Welcome"

        binding.getStartedButton.setOnClickListener {
            // Handle the "Get Started" button click
            // For example, you can start a new activity or fragment
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}