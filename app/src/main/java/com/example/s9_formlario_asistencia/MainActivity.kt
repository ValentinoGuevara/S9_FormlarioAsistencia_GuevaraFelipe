package com.example.s9_formlario_asistencia

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var dbHelper: DatabaseHelper

    // Inicializamos los campos de entrada
    private lateinit var editTextName: EditText
    private lateinit var editTextSurname: EditText
    private lateinit var editTextCode: EditText
    private lateinit var editTextDni: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPhone: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar el Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)  // Establecer el toolbar como ActionBar

        // Inicializar DatabaseHelper
        dbHelper = DatabaseHelper(this)

        // Inicializar los campos de texto
        editTextName = findViewById(R.id.editTextNombres)
        editTextSurname = findViewById(R.id.editTextApellidos)
        editTextCode = findViewById(R.id.editTextCodigo)
        editTextDni = findViewById(R.id.editTextDNI)
        editTextEmail = findViewById(R.id.editTextCorreo)
        editTextPhone = findViewById(R.id.editTextTelefono)

        // Configurar el botón para guardar los datos
        val buttonConfirmar = findViewById<Button>(R.id.buttonConfirmar)
        buttonConfirmar.setOnClickListener {
            saveData()
        }
    }

    // Método para guardar los datos en la base de datos
    private fun saveData() {
        val name = editTextName.text.toString()
        val surname = editTextSurname.text.toString()
        val code = editTextCode.text.toString()
        val dni = editTextDni.text.toString()
        val email = editTextEmail.text.toString()
        val phone = editTextPhone.text.toString()

        // Validar que todos los campos tengan datos
        if (name.isEmpty() || surname.isEmpty() || code.isEmpty() || dni.isEmpty() || email.isEmpty() || phone.isEmpty()) {
            Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
        } else {
            // Insertar los datos en la base de datos
            val result = dbHelper.insertData(name, surname, code, dni, email, phone)
            if (result != -1L) {
                // Si la inserción es exitosa, navegar a SuccessActivity
                val intent = Intent(this, SuccessActivity::class.java)
                startActivity(intent)  // Iniciar la nueva actividad
            } else {
                Toast.makeText(this, "Error al guardar los datos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Inflar el menú de opciones en la Toolbar
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)  // Inflar el archivo del menú
        return true
    }

    // Manejar la selección de las opciones del menú
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.option_1 -> {
                // Acción para la opción 1: abrir WebViewActivity
                val intent = Intent(this, WebViewActivity::class.java)
                startActivity(intent)  // Iniciar la actividad WebView
                true
            }
            R.id.option_2 -> {
                // Acción para la opción 2 (si es necesario)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
