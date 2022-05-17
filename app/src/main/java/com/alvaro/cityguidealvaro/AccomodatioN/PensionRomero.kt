package com.alvaro.cityguidealvaro.AccomodatioN

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import com.alvaro.cityguidealvaro.MainActivity
import com.alvaro.cityguidealvaro.R

class PensionRomero : AppCompatActivity() {

    lateinit var ratingBar: RatingBar
    lateinit var review: EditText
    lateinit var submitbtn: Button
    lateinit var rateCount: TextView
    lateinit var showRating: TextView
    var rateValue: Float ?=null
    lateinit var temp: String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pension_romero)



        ratingBar=findViewById(R.id.ratingBar)
        review=findViewById(R.id.review)
        submitbtn=findViewById(R.id.submit)
        rateCount=findViewById(R.id.ratecount)
        showRating=findViewById(R.id.showrating)


        submitbtn.setOnClickListener(){
            onClick2()
        }

    }


    fun onClick2(){
        rateValue=ratingBar.getRating()
        rateCount.setText(" "+rateValue+"/5")
        temp = rateCount.getText().toString()
        showRating.setText("Your Rating:"+temp+"\n"+review.getText())
        ratingBar.setRating(0F)
        rateCount.setText("")
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menu_romero, menu);
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.home -> {
                Toast.makeText(applicationContext, "Changed to Home", Toast.LENGTH_LONG)
                    .show()
                val i = Intent(applicationContext, MainActivity::class.java)
                startActivity(i)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}