package com.example.listenlearn

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listenlearn.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRegister.setOnClickListener {
            val fullName = binding.editTextFullname.text.toString()
            val email = binding.editTextEmail.text.toString()
            val phoneNumber = binding.editTextPhone.text.toString()
            val password = binding.editTextPassword.text.toString()
            val termsAndConditions = binding.checkBox.isChecked

            if (fullName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!termsAndConditions) {
                Toast.makeText(this, "Please agree to our Terms and Conditions", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Register user logic here
            // For example, you can call an API to register the user
            // or store the user data in a local database

            Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.textView3.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}