package com.alvaro.cityguidealvaro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alvaro.cityguidealvaro.PlaceS.*

class Places : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)


        val catedralbtn = findViewById<Button>(R.id.catedral)
        catedralbtn.setOnClickListener {
            openCathedral()
        }
        val fontanbtn = findViewById<Button>(R.id.fontan)
        fontanbtn.setOnClickListener {
            openFontan()
        }
        val gasconabtn = findViewById<Button>(R.id.gascona)
        gasconabtn.setOnClickListener {
            openGascona()
        }
        val stamariabtn = findViewById<Button>(R.id.wonder)
        stamariabtn.setOnClickListener {
            openStaMaria()
        }
        val calatravabtn2 = findViewById<Button>(R.id.llagar)
        calatravabtn2.setOnClickListener {
            openCalatravaxx()
        }
    }
    fun openCalatravaxx() {
        val j = Intent(applicationContext, calatravaxx::class.java)
        startActivity(j)

    }

    fun openCathedral() {
        val l = Intent(applicationContext, Cathedral::class.java)
        startActivity(l)

    }

    fun openFontan() {
        val t = Intent(applicationContext, Fontan::class.java)
        startActivity(t)

    }
    fun openGascona() {
        val t = Intent(applicationContext, Gascona::class.java)
        startActivity(t)

    }
    fun openStaMaria() {
        val t = Intent(applicationContext, StaMaria::class.java)
        startActivity(t)

    }
}
