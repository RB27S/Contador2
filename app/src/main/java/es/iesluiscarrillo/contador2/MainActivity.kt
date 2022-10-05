package es.iesluiscarrillo.contador2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvContador = findViewById<TextView>(R.id.tvContador)

        tvContador.setText(contador.toString())
    }
}