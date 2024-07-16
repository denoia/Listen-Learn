package com.example.listenlearn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginButton: Button
    private lateinit var forgotPasswordText: TextView
    private lateinit var signUpText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        emailInput = findViewById(R.id.email_input)
        passwordInput = findViewById(R.id.password_input)
        loginButton = findViewById(R.id.login_button)
        forgotPasswordText = findViewById(R.id.forgot_password_text)
        signUpText = findViewById(R.id.sign_up_text)

        loginButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            // Validate input fields
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter both email and password", Toast.LENGTH_SHORT)
                    .show()
            }

            // Navigate to the next activity
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }

        forgotPasswordText.setOnClickListener {
            // Handle forgot password logic
            Toast.makeText(this, "Forgot password clicked", Toast.LENGTH_SHORT).show()
        }

        signUpText.setOnClickListener {
            // Handle sign up logic
            Toast.makeText(this, "Sign up clicked", Toast.LENGTH_SHORT).show()
        }
    }
}