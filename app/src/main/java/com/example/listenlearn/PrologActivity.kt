package com.example.prolog

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listenlearn.NextActivity
import com.example.listenlearn.R
import com.example.listenlearn.databinding.ActivityPrologBinding

class PrologActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPrologBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrologBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set title and description text
        binding.tvTitle.text = getString(R.string.signin)
        binding.tvDesc.text = getString(R.string.signin)

        // Set read and listened text
        binding.tvRead.text = getString(R.string.read_count, 500_000)
        binding.tvListened.text = getString(R.string.listened_count, 556_000)

        // Set kvote text
        binding.tvKvote.text = getString(R.string.kvote_count, 10)

        // Set button click listener
        binding.btnStart.setOnClickListener {
            // Navigate to next activity
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }
    }
}
