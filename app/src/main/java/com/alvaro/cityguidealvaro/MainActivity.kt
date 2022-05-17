package com.alvaro.cityguidealvaro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.events -> {
                Toast.makeText(applicationContext, "Changed to Events", Toast.LENGTH_LONG)
                    .show()
                val i = Intent(applicationContext, Events::class.java)
                startActivity(i)
                return true
            }
            R.id.Places -> {
                Toast.makeText(applicationContext, "Changed to Places", Toast.LENGTH_LONG).show()
                val j = Intent(applicationContext, Places::class.java)
                startActivity(j)
                return true
            }
            R.id.Accomodation -> {
                Toast.makeText(applicationContext, "Changed to Accommodation", Toast.LENGTH_LONG).show()
                val p = Intent(applicationContext, Accomodation::class.java)
                startActivity(p)
                return true
            }
            R.id.GuidedTours -> {
                Toast.makeText(applicationContext, "Changed to Guided Tours", Toast.LENGTH_LONG).show()
                val p = Intent(applicationContext, Guided_Tours::class.java)
                startActivity(p)
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }



}