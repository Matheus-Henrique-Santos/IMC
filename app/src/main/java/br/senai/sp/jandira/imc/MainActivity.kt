package br.senai.sp.jandira.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_saudavell)

        val necessidade = findViewById<Button>(R.id.necessidade_caloricas)

        necessidade.setOnClickListener {

            val abrirActivityNecessidade = Intent(this,CaloriaActivity::class.java)


            startActivity(abrirActivityNecessidade)
        }
    }
}
