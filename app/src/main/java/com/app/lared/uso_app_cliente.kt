package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class uso_app_cliente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uso_app_cliente)

        val buscarNegociosAliados : Button = findViewById(R.id.conocer_aliados)
        buscarNegociosAliados.setOnClickListener {
            val intent = Intent(this, buscar_aliados :: class.java)
            startActivity(intent)
        }
    }
}
