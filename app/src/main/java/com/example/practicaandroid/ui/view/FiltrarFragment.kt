package com.example.practicaandroid.ui.view

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import com.example.practicaandroid.R
import com.example.practicaandroid.databinding.FiltrarFacturaBinding

class FiltrarFragment : Fragment() {
    private lateinit var binding: FiltrarFacturaBinding
    var btnDesde: Button? = null
    var btnHasta: Button? = null
    var dpFecha: DatePicker? = null
    var dpFechaFin: DatePicker? = null

    /*@RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FiltrarFacturaBinding.inflate(layoutInflater)

        btnDesde = binding.btnFechaIncio
        btnHasta = binding.btnFechaFin
        dpFecha = binding.dpFecha
        dpFechaFin = binding.dpFechaFin

        btnDesde?.setText(getFecha())
        dpFecha?.setOnDateChangedListener{
                dpFecha, anyo, mes, dia ->
            btnDesde?.setText(getFecha())
            dpFecha?.visibility = View.GONE
        }

        btnHasta?.setText(getFecha())
        dpFechaFin?.setOnDateChangedListener{
                dpFecha, anyo, mes, dia ->
            btnHasta?.setText(getFecha())
            dpFecha?.visibility = View.GONE
        }
    }

    fun getFecha():String {
        var resultado = ""
        var dia = dpFecha?.dayOfMonth.toString().padStart(2, '0')
        var mes = (dpFecha!!.month + 1).toString().padStart(2, '0')
        var anyo = dpFecha?.year.toString().padStart(4, '0')

        var diaHasta = dpFechaFin?.dayOfMonth.toString().padStart(2, '0')
        var mesHasta = (dpFechaFin!!.month + 1).toString().padStart(2, '0')
        var anyoHasta = dpFechaFin?.year.toString().padStart(4, '0')

        if (btnDesde?.isPressed == true) {
            resultado = dia + "/" + mes + "/" + anyo
        } else if (btnHasta?.isPressed == true) {
            resultado = diaHasta + "/" + mesHasta + "/" + anyoHasta
        }

        return resultado

    }

    fun mostrarCalendario(view: View) {
        dpFecha?.visibility = View.VISIBLE
        dpFechaFin?.visibility = View.VISIBLE
    }*/
}