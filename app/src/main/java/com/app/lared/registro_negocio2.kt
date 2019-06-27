package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro_negocio2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_negocio2)

        val registroNuevoNegocio : Button = findViewById(R.id.continuar_reg_neg2)
        registroNuevoNegocio.setOnClickListener {
            val intent = Intent(this, registro_negocio3 :: class.java)
            startActivity(intent)
        }
    }
}
