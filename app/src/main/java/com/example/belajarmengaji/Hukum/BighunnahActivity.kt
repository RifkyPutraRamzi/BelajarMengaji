package com.example.belajarmengaji.Hukum

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.belajarmengaji.HomeActivity
import com.example.belajarmengaji.Profile.MenuProfileActivity
import com.example.belajarmengaji.Quiz.MenuQuizActivity
import com.example.belajarmengaji.R

class BighunnahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bighunnah)
        val pindah1 = findViewById<View>(R.id.btn_back) as ImageView
        val pindah2 = findViewById<View>(R.id.btn_kuis) as ImageView
        val pindah3 = findViewById<View>(R.id.btn_home) as ImageView
        val pindah4 = findViewById<View>(R.id.btn_akun) as ImageView
        pindah1.setOnClickListener {
            val intent = Intent(this@BighunnahActivity, IdghamActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah2.setOnClickListener {
            val intent = Intent(this@BighunnahActivity, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah3.setOnClickListener {
            val intent = Intent(this@BighunnahActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah4.setOnClickListener {
            val intent = Intent(this@BighunnahActivity, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        //InputSuara
        val SuaraMim = MediaPlayer.create(this, R.raw.mim)
        val SuaraNun = MediaPlayer.create(this, R.raw.nun)
        val SuaraWau = MediaPlayer.create(this, R.raw.wau)
        val SuaraYa = MediaPlayer.create(this, R.raw.ya)
        val SuaraBighunnahsatu = MediaPlayer.create(this, R.raw.bighunnahsatu)

        //VariabelButton
        val ButtonSuara1 = findViewById<View>(R.id.btn_mim) as ImageButton
        val ButtonSuara2 = findViewById<View>(R.id.btn_nun) as ImageButton
        val ButtonSuara3 = findViewById<View>(R.id.btn_wau) as ImageButton
        val ButtonSuara4 = findViewById<View>(R.id.btn_ya) as ImageButton
        val ButtonSuara5 = findViewById<View>(R.id.btn_bighunnahsatu) as ImageButton
        ButtonSuara1.setOnClickListener { SuaraMim.start() }
        ButtonSuara2.setOnClickListener { SuaraNun.start() }
        ButtonSuara3.setOnClickListener { SuaraWau.start() }
        ButtonSuara4.setOnClickListener { SuaraYa.start() }
        ButtonSuara5.setOnClickListener { SuaraBighunnahsatu.start() }
    }

    override fun onBackPressed() {
        val keluar = MediaPlayer.create(this, R.raw.keluar)
        keluar.start()
        AlertDialog.Builder(this)
            .setIcon(R.mipmap.ic_launcher)
            .setTitle(R.string.app_name)
            .setMessage("Apakah Kamu Ingin Keluar Aplikasi?")
            .setPositiveButton(
                "OK"
            ) { dialog, which -> finish() }
            .setNegativeButton(
                "Batal"
            ) { dialog, which -> dialog.cancel() }
            .show()
    }
}