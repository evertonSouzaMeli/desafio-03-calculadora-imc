package br.com.fiap.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
        var altura = editTextAltura.text.toString().toDouble()

        var resultado = when(rdgSexo.checkedRadioButtonId){
            R.id.rdbFeminino -> (62.1 * altura) - 44.7
            R.id.rdbMasculino -> (72.7 * altura) - 58
            else -> 0.0
        }.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN)

            Toast.makeText(this, resultado.toString(), Toast.LENGTH_LONG).show()
        }
    }
}