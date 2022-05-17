package com.alvaro.cityguidealvaro.PlaceS

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

class Cathedral : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer?=null
    lateinit var uri: Uri
    lateinit var play: Button
    lateinit var videoView: VideoView
    lateinit var videoPath: String
    lateinit var mediaController: MediaController

    lateinit var ratingBar: RatingBar
    lateinit var review: EditText
    lateinit var submitbtn: Button
    lateinit var rateCount: TextView
    lateinit var showRating: TextView
    var rateValue: Float ?=null
    lateinit var temp: String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cathedral)

        play= findViewById(R.id.play)
        mediaPlayer= MediaPlayer.create(this,R.raw.catedralaudio)

        play.setOnClickListener{
            onClick()
        }
        videoView=findViewById(R.id.videoView)
        videoPath="android.resource://"+ packageName +"/"+R.raw.catedralvideo
        uri= Uri.parse(videoPath)
        videoView.setVideoURI(uri)

        mediaController= MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        ratingBar=findViewById(R.id.ratingBar)
        review=findViewById(R.id.review)
        submitbtn=findViewById(R.id.submit)
        rateCount=findViewById(R.id.ratecount)
        showRating=findViewById(R.id.showrating)


        submitbtn.setOnClickListener(){
            onClick2()
        }

    }

    fun onClick(){
        mediaPlayer?.start()
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
        getMenuInflater().inflate(R.menu.menu_catedral, menu);
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