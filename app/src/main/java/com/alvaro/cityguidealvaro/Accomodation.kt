package com.alvaro.cityguidealvaro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alvaro.cityguidealvaro.AccomodatioN.PensionRomero
import com.alvaro.cityguidealvaro.AccomodatioN.PrincesaMunia
import com.alvaro.cityguidealvaro.AccomodatioN.Reconquista

class Accomodation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accomodation)

        val romerobtn = findViewById<Button>(R.id.llagar)
        romerobtn.setOnClickListener {
            openRomero()
        }
        val muniabtn = findViewById<Button>(R.id.catedral)
        muniabtn.setOnClickListener {
            openMunia()
        }

        val reconqbtn = findViewById<Button>(R.id.wonder)
        reconqbtn.setOnClickListener {
            openRecon()
        }
    }
    fun openRomero() {
        val k = Intent(applicationContext, PensionRomero::class.java)
        startActivity(k)

    }
    fun openMunia() {
        val k = Intent(applicationContext, PrincesaMunia::class.java)
        startActivity(k)

    }

    fun openRecon() {
        val k = Intent(applicationContext, Reconquista::class.java)
        startActivity(k)

    }
}