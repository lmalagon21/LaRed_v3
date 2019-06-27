package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro_negocio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_negocio)

        val registroNuevoNegocio : Button = findViewById(R.id.continuar_reg_neg2)
        registroNuevoNegocio.setOnClickListener {
            val intent = Intent(this, registro_negocio2 :: class.java)
            startActivity(intent)
        }
    }
}
