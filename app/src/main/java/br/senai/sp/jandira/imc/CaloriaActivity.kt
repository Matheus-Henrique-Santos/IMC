package br.senai.sp.jandira.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CaloriaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caloria)

        val botaoImc = findViewById<Button>(R.id.indice_massa)
        val botaoNecessidade = findViewById<Button>(R.id.button_resultadoCal)

        botaoNecessidade.setOnClickListener {

            val abrirActivityResultadoNecessidade = Intent(this,NecessidadeCalorica::class.java)


            startActivity(abrirActivityResultadoNecessidade)
        }

        botaoImc.setOnClickListener {

            val abrirActivityResultadoImc = Intent(this,ImcActivity::class.java)


            startActivity(abrirActivityResultadoImc)

        }
    }
}
