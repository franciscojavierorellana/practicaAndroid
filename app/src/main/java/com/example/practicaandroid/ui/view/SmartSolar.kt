package com.example.practicaandroid.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practicaandroid.databinding.ActivitySmartSolarBinding

class SmartSolar : AppCompatActivity() {

    private lateinit var binding: ActivitySmartSolarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySmartSolarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragmento(InstalacionFragment(), "Mi instalacion")
        fragmentAdapter.addFragmento(EnergiaFragment(), "Energia")
        fragmentAdapter.addFragmento(DetallesFragment(), "Detalles")

        binding.viewPager.adapter = fragmentAdapter
        binding.tabs.setupWithViewPager(binding.viewPager)
    }
}