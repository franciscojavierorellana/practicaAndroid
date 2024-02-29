package com.example.practicaandroid.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practicaandroid.adapter.FacturaAdapter
import com.example.practicaandroid.data.model.DetallesFactura
import com.example.practicaandroid.databinding.ActivityListadoFacturasBinding
import com.example.practicaandroid.databinding.ActivityMainBinding
import com.example.practicaandroid.ui.viewModel.FacturaViewModel

class ListadoFacturas : AppCompatActivity() {
    private lateinit var binding: ActivityListadoFacturasBinding
    private lateinit var adapter: FacturaAdapter
    private val facturaViewModel: FacturaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListadoFacturasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView(emptyList())
        facturaViewModel.detallesFacturaModel.observe(this, Observer {
            facturaViewModel.onCreate()
            initRecyclerView(it)
        })

        binding.consumoButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.filtroButton.setOnClickListener{
            val intent = Intent(this, FiltrarActivity::class.java)
            startActivity(intent)
        }

    }

    private fun initRecyclerView(listFactura: List<DetallesFactura>) {
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        adapter = FacturaAdapter(listFactura)
        binding.rvFacturasList.layoutManager = manager
        binding.rvFacturasList.adapter = adapter
        binding.rvFacturasList.addItemDecoration(decoration)
    }
}