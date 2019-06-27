package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class uso_app_cliente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uso_app_cliente)

        val terminarSesion : Button = findViewById(R.id.salir_delared)
        terminarSesion.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }

        val buscarNegociosAliados : Button = findViewById(R.id.conocer_aliados)
        buscarNegociosAliados.setOnClickListener {
            val intent = Intent(this, buscar_aliados :: class.java)
            startActivity(intent)
        }

        val transferirPuntos : Button = findViewById(R.id.transferir_puntos)
        transferirPuntos.setOnClickListener {
            val intent = Intent(this, transferir_puntos :: class.java)
            startActivity(intent)
        }

        val buscarNegociosPromocion : Button = findViewById(R.id.negocios_promocion)
        buscarNegociosPromocion.setOnClickListener {
            val intent = Intent(this, buscar_promocion :: class.java)
            startActivity(intent)
        }

    }
}