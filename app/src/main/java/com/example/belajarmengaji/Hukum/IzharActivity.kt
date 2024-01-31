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

class IzharActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_izhar)
        val pindah1 = findViewById<View>(R.id.btn_back) as ImageView
        val pindah2 = findViewById<View>(R.id.btn_kuis) as ImageView
        val pindah3 = findViewById<View>(R.id.btn_home) as ImageView
        val pindah4 = findViewById<View>(R.id.btn_akun) as ImageView
        pindah1.setOnClickListener {
            val intent = Intent(this@IzharActivity, HukumNunMatiActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah2.setOnClickListener {
            val intent = Intent(this@IzharActivity, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah3.setOnClickListener {
            val intent = Intent(this@IzharActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah4.setOnClickListener {
            val intent = Intent(this@IzharActivity, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        //InputSuara
        val SuaraAlif = MediaPlayer.create(this, R.raw.alif)
        val SuaraHa = MediaPlayer.create(this, R.raw.ha)
        val SuaraKha = MediaPlayer.create(this, R.raw.kha)
        val SuaraAin = MediaPlayer.create(this, R.raw.ain)
        val SuaraGhin = MediaPlayer.create(this, R.raw.ghin)
        val SuaraHaa = MediaPlayer.create(this, R.raw.haa)
        val SuaraHamzah = MediaPlayer.create(this, R.raw.hamzah)
        val SuaraIzharsatu = MediaPlayer.create(this, R.raw.izharsatu)
        val SuaraIzhardua = MediaPlayer.create(this, R.raw.izhardua)
        val SuaraIzhartiga = MediaPlayer.create(this, R.raw.izhartiga)

        //VariabelButton
        val ButtonSuara1 = findViewById<View>(R.id.btn_alif) as ImageButton
        val ButtonSuara2 = findViewById<View>(R.id.btn_ha) as ImageButton
        val ButtonSuara3 = findViewById<View>(R.id.btn_kha) as ImageButton
        val ButtonSuara4 = findViewById<View>(R.id.btn_ain) as ImageButton
        val ButtonSuara5 = findViewById<View>(R.id.btn_ghin) as ImageButton
        val ButtonSuara6 = findViewById<View>(R.id.btn_haa) as ImageButton
        val ButtonSuara7 = findViewById<View>(R.id.btn_hamzah) as ImageButton
        val ButtonSuara8 = findViewById<View>(R.id.btn_izharsatu) as ImageButton
        val ButtonSuara9 = findViewById<View>(R.id.btn_izhardua) as ImageButton
        val ButtonSuara10 = findViewById<View>(R.id.btn_izhartiga) as ImageButton
        ButtonSuara1.setOnClickListener { SuaraAlif.start() }
        ButtonSuara2.setOnClickListener { SuaraHa.start() }
        ButtonSuara3.setOnClickListener { SuaraKha.start() }
        ButtonSuara4.setOnClickListener { SuaraAin.start() }
        ButtonSuara5.setOnClickListener { SuaraGhin.start() }
        ButtonSuara6.setOnClickListener { SuaraHaa.start() }
        ButtonSuara7.setOnClickListener { SuaraHamzah.start() }
        ButtonSuara8.setOnClickListener { SuaraIzharsatu.start() }
        ButtonSuara9.setOnClickListener { SuaraIzhardua.start() }
        ButtonSuara10.setOnClickListener { SuaraIzhartiga.start() }
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