package com.example.practicaandroid.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicaandroid.data.model.DetallesFactura
import com.example.practicaandroid.domain.GetFacturaUseCase
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class FacturaViewModel : ViewModel() {
    val detallesFacturaModel = MutableLiveData<List<DetallesFactura>>()

    var getFacturaUseCase = GetFacturaUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val factura = getFacturaUseCase()
            if (factura != null) {
                factura.let {
                    detallesFacturaModel.postValue(it) }
            }
        }
    }
}