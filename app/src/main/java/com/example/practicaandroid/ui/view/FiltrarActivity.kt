package com.example.practicaandroid.ui.view

import android.app.DatePickerDialog
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.practicaandroid.databinding.FiltrarFacturaBinding
import java.util.Calendar

class FiltrarActivity : AppCompatActivity() {
    private lateinit var binding: FiltrarFacturaBinding
    var btnDesde: Button? = null
    var btnHasta: Button? = null
    private lateinit var calendar: Calendar

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FiltrarFacturaBinding.inflate(layoutInflater)
        setContentView(binding.viewFilter)

        btnDesde = binding.btnFechaIncio
        btnHasta = binding.btnFechaFin
        calendar = Calendar.getInstance()

        btnDesde!!.setOnClickListener{
            seleccionaFecha(btnDesde!!)
        }

        btnHasta!!.setOnClickListener{
            seleccionaFecha(btnHasta!!)
        }

    }

    private fun seleccionaFecha(button: Button) {
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view, anyo, mes, dia ->
            val selectedDate = "$dia/${mes + 1}/$anyo"
            if (button == btnDesde) {
                btnDesde!!.setText(selectedDate)
            } else if (button == btnHasta) {
                btnHasta!!.setText(selectedDate)
            }
        }, year, month, day)

        datePickerDialog.show()
    }
}