package es.iesluiscarrillo.contador2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Objeto con la referencia del cuadro de texto (tvContador)
        val tvContador = findViewById<TextView>(R.id.tvContador)

        //Se muestra en el cuadro de texto el número que tenga almacenada la variable "contador"
        tvContador.text = contador.toString()

        //Objetos con la referencia de los botones de suma y resta (bSuma y bResta)
        val bSuma = findViewById<Button>(R.id.bSuma)
        val bResta = findViewById<Button>(R.id.bResta)

        //Listeners para los eventos de click de cada boton
        bSuma.setOnClickListener {
            contador++
            tvContador.text = contador.toString()
        }
        bResta.setOnClickListener {
            contador--
            tvContador.text = contador.toString()
        }
    }

    //Sobrecarga del método onSaveInstanceState para el guardado del valor del contador
    override fun onSaveInstanceState(estadoAGuardar: Bundle) {
        super.onSaveInstanceState(estadoAGuardar)
        estadoAGuardar.putInt("CONTADOR", contador)
    }

    //Sobrecarga del método onRestoreInstanceState para mostrar el valor del contador en
    //el cuadro de texto una vez se restaure la aplicación
    override fun onRestoreInstanceState(estadoARestaurar: Bundle) {
        super.onRestoreInstanceState(estadoARestaurar)
        contador = estadoARestaurar.getInt("CONTADOR")

        //Objeto con la referencia del cuadro de texto (tvContador)
        val tvContador = findViewById<TextView>(R.id.tvContador)
        tvContador.text = contador.toString()
    }
}