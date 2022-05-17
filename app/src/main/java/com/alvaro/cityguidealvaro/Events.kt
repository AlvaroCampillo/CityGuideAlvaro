package com.alvaro.cityguidealvaro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alvaro.cityguidealvaro.EventS.Football
import com.alvaro.cityguidealvaro.EventS.SanMateo
import com.alvaro.cityguidealvaro.EventS.SanSilvestre

class Events : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

        val sanmateobtn = findViewById<Button>(R.id.llagar)
        sanmateobtn.setOnClickListener {
            openSanMateo()
        }
        val sansilvestrebtn = findViewById<Button>(R.id.fontan)
        sansilvestrebtn.setOnClickListener {
            openSanSilvestre()
        }
        val footballbtn = findViewById<Button>(R.id.wonder)
        footballbtn.setOnClickListener {
            openFootball()
        }
    }
    fun openSanMateo() {
        val k = Intent(applicationContext, SanMateo::class.java)
        startActivity(k)

    }

    fun openSanSilvestre() {
        val l = Intent(applicationContext, SanSilvestre::class.java)
        startActivity(l)

    }

    fun openFootball() {
        val t = Intent(applicationContext, Football::class.java)
        startActivity(t)

    }
}