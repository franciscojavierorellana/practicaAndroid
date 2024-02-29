package com.example.practicaandroid.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practicaandroid.R
import com.example.practicaandroid.adapter.FacturaAdapter
import com.example.practicaandroid.data.model.DetallesFactura
import com.example.practicaandroid.databinding.ActivityMainBinding
import com.example.practicaandroid.ui.viewModel.FacturaViewModel

class ListadoFragment : Fragment() {
    /*private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: FacturaAdapter
    private val facturaViewModel: FacturaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        facturaViewModel.onCreate()
        initRecyclerView(emptyList())
        facturaViewModel.detallesFacturaModel.observe(this, Observer {
            initRecyclerView(it)
        })

    }

    private fun initRecyclerView(listFactura: List<DetallesFactura>) {
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        adapter = FacturaAdapter(listFactura)
        binding.rvFacturasList.layoutManager = manager
        binding.rvFacturasList.adapter = adapter
        binding.rvFacturasList.addItemDecoration(decoration)
        //binding.viewRoot.setOnClickListener{FacturaActivity.facturaViewModel.detallesFacturaModel}
    }

    fun filtrarFacturas() {
        val intent = Intent(this, FiltrarActivity::class.java)
        startActivityForResult(intent)
    }*/
}