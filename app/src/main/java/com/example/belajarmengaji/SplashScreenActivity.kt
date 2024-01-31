package com.example.belajarmengaji

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //InputSuara
        val SelamatDatang = MediaPlayer.create(this, R.raw.selamat_datang)
        SelamatDatang.start()

        Handler().postDelayed({
            val intent = Intent(this, GreetingOneActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}