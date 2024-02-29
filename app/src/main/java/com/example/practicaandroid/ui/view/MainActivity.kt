package com.example.practicaandroid.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practicaandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listadoFactura.setOnClickListener{
            val intent = Intent(this, ListadoFacturas::class.java)
            startActivity(intent)
        }

        binding.smartSolar.setOnClickListener{
            val intent = Intent(this, SmartSolar::class.java)
            startActivity(intent)
        }
    }

}
