package com.alvaro.cityguidealvaro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alvaro.cityguidealvaro.Tours.MaravillasOviedo
import com.alvaro.cityguidealvaro.Tours.MitosLeyendas
import com.alvaro.cityguidealvaro.Tours.llagarxx

class Guided_Tours : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guided_tours)

        val llagarbtn = findViewById<Button>(R.id.llagar)
        llagarbtn.setOnClickListener {
            openLlagar()
        }
        val maravillasbtn = findViewById<Button>(R.id.wonder)
        maravillasbtn.setOnClickListener {
            openMaravill()
        }
        val mitosbtn = findViewById<Button>(R.id.mitos)
        mitosbtn.setOnClickListener {
            openMitos()
        }
    }
    fun openLlagar() {
        val k = Intent(applicationContext, llagarxx::class.java)
        startActivity(k)

    }
    fun openMaravill() {
        val k = Intent(applicationContext, MaravillasOviedo::class.java)
        startActivity(k)

    }
    fun openMitos() {
        val k = Intent(applicationContext, MitosLeyendas::class.java)
        startActivity(k)

    }
}