package com.example.secondapp

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.secondapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button1.setBackgroundColor(Color.parseColor("#0000ff"))
        binding.button2.setBackgroundColor(Color.parseColor("#0000ff"))
        binding.button3.setBackgroundColor(Color.parseColor("#0000ff"))
        binding.button4.setBackgroundColor(Color.parseColor("#0000ff"))

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.button1.setOnClickListener {
            binding.button1.setBackgroundColor(Color.parseColor("#00ff00"))
            binding.button2.setBackgroundColor(Color.parseColor("#ff0000"))
            binding.button3.setBackgroundColor(Color.parseColor("#ff0000"))
            binding.button4.setBackgroundColor(Color.parseColor("#ff0000"))
        }
        binding.button2.setOnClickListener {
            binding.button1.setBackgroundColor(Color.parseColor("#ff0000"))
            binding.button2.setBackgroundColor(Color.parseColor("#00ff00"))
            binding.button3.setBackgroundColor(Color.parseColor("#ff0000"))
            binding.button4.setBackgroundColor(Color.parseColor("#ff0000"))
        }
        binding.button3.setOnClickListener {
            binding.button1.setBackgroundColor(Color.parseColor("#ff0000"))
            binding.button2.setBackgroundColor(Color.parseColor("#ff0000"))
            binding.button3.setBackgroundColor(Color.parseColor("#00ff00"))
            binding.button4.setBackgroundColor(Color.parseColor("#ff0000"))
        }
        binding.button4.setOnClickListener {
            binding.button1.setBackgroundColor(Color.parseColor("#ff0000"))
            binding.button2.setBackgroundColor(Color.parseColor("#ff0000"))
            binding.button3.setBackgroundColor(Color.parseColor("#ff0000"))
            binding.button4.setBackgroundColor(Color.parseColor("#00ff00"))
        }
    }
}
