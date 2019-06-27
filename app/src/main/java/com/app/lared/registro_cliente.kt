package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro_cliente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente)

        val registroNuevoCliente : Button = findViewById(R.id.continuar_regcliente)
        registroNuevoCliente.setOnClickListener {
            val intent = Intent(this, registro_cliente1 :: class.java)
            startActivity(intent)
        }
    }
}
