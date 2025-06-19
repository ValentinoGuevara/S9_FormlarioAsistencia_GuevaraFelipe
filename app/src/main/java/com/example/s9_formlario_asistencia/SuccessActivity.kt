package com.example.s9_formlario_asistencia

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        // Configurar el botón para regresar
        val buttonOk = findViewById<Button>(R.id.buttonOk)
        buttonOk.setOnClickListener {
            finish()  // Cierra la actividad actual (SuccessActivity) y regresa a la anterior
        }
    }
}
