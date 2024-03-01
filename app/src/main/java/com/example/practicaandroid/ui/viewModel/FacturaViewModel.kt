package com.example.practicaandroid.ui.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.practicaandroid.data.model.DetallesFactura
import com.example.practicaandroid.data.model.DetallesFacturaDao
import com.example.practicaandroid.data.model.DetallesFacturaDb
import com.example.practicaandroid.domain.GetFacturaUseCase
import kotlinx.coroutines.launch

class FacturaViewModel (application: Application) : AndroidViewModel(application) {
    private val facturaDao: DetallesFacturaDao

    val detallesFacturaModel = MutableLiveData<List<DetallesFactura>>()

    var getFacturaUseCase = GetFacturaUseCase()

    private val database: DetallesFacturaDb by lazy{DetallesFacturaDb.getDatabase(application)}
    init {
        facturaDao = database.DetallesFacturaDao()
    }
    fun insertFacturasFromApi(facturas: List<DetallesFactura>) {
        viewModelScope.launch {
            facturaDao.insertFacturas(facturas)
        }
    }
    fun EliminarFacturasDeBDD() {
        viewModelScope.launch {
            facturaDao.eliminarBaseDeDatos()
        }
    }

    fun getAllFacturas(): LiveData<List<DetallesFactura>> {
        return facturaDao.getAllFacturas()
    }

    fun onCreate() {
        viewModelScope.launch {
            val factura = getFacturaUseCase()
            if (factura != null) {
                factura.let {
                    detallesFacturaModel.postValue(it) }
            }
        }
    }

    class FacturasViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
        override fun<T : ViewModel> create(modelClass:Class<T>): T {
            return FacturaViewModel(application) as T
        }
    }
}