package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val registroNuevoNegocio : Button = findViewById(R.id.negocio)
        registroNuevoNegocio.setOnClickListener {
            val intent = Intent(this, registro_negocio :: class.java)
            startActivity(intent)
        }

        val registroNuevoCliente : Button = findViewById(R.id.cliente)
        registroNuevoCliente.setOnClickListener {
            val intent = Intent(this, registro_cliente :: class.java)
            startActivity(intent)
        }

        val usoAppNegocio : Button = findViewById(R.id.entrar_red_negocio)
        usoAppNegocio.setOnClickListener {
            val intent = Intent(this, uso_app_negocio :: class.java)
            startActivity(intent)
        }

        val usoAppCliente : Button = findViewById(R.id.entrar_red_cliente)
        usoAppCliente.setOnClickListener {
            val intent = Intent(this, uso_app_cliente :: class.java)
            startActivity(intent)

        }

        //val b1 = findViewById<View>(R.id.es_negocio) as Switch
        //val b2 = findViewById<View>(R.id.es_cliente) as Switch
        //val b3 = findViewById<View>(R.id.entrar_red_cliente) as Button
        //val b4 = findViewById<View>(R.id.entrar_red_negocio) as Button
        //b1.setOnClickListener()
        val swC = findViewById<Switch>(R.id.es_cliente)
        val swN = findViewById<Switch>(R.id.es_negocio)
        val swPW = findViewById<Switch>(R.id.olvido_pwd)

        swC?.setOnCheckedChangeListener { _, isChecked ->
            swN.setChecked(!isChecked)
            usoAppCliente.isEnabled = (true)
            usoAppNegocio.isEnabled = (false)
            usoAppCliente.visibility = (View.VISIBLE)
            usoAppNegocio.visibility = (View.INVISIBLE)
        }


        swN?.setOnCheckedChangeListener { _, isChecked ->
            swC.setChecked(!isChecked)
            usoAppNegocio.isEnabled = (true)
            usoAppCliente.isEnabled = (false)
            usoAppNegocio.visibility = (View.VISIBLE)
            usoAppCliente.visibility = (View.INVISIBLE)
        }

        swPW?.setOnCheckedChangeListener { _, isChecked ->
            //swPW.setChecked(!isChecked)
            usoAppCliente.isEnabled = (false)
            usoAppNegocio.isEnabled = (false)
            val intent = Intent(this, olvido_password :: class.java)
            startActivity(intent)
        }

    }
}
