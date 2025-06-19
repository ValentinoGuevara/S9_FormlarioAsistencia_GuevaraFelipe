package com.example.s9_formlario_asistencia

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        // Configuramos el Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)  // Configura el toolbar como la ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)  // Habilitar el botón de regreso

        // Configuramos el WebView
        val webView: WebView = findViewById(R.id.webView)

        // Habilitar JavaScript en el WebView
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true

        // Establecer un WebViewClient para que los enlaces se abran dentro del WebView
        webView.webViewClient = WebViewClient()

        // Cargar la página web
        webView.loadUrl("https://radiorsd.pe/noticias/martes-17-chimbote-presentaran-programa-oficial-de-la-fiesta-de-san-pedrito-2025")

        // Configurar el evento del botón de regreso en la barra de herramientas
        toolbar.setNavigationOnClickListener {
            // Volver a la actividad anterior (MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Finaliza la actividad WebViewActivity
        }
    }

    // Manejo de la retroceder en el WebView
    override fun onBackPressed() {
        val webView: WebView = findViewById(R.id.webView)
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
