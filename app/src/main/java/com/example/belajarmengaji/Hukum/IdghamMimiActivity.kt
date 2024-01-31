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

class IdghamMimiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idgham_mimi)
        val pindah1 = findViewById<View>(R.id.btn_back) as ImageView
        val pindah2 = findViewById<View>(R.id.btn_kuis) as ImageView
        val pindah3 = findViewById<View>(R.id.btn_home) as ImageView
        val pindah4 = findViewById<View>(R.id.btn_akun) as ImageView
        pindah1.setOnClickListener {
            val intent = Intent(this@IdghamMimiActivity, HukumMimMatiActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah2.setOnClickListener {
            val intent = Intent(this@IdghamMimiActivity, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah3.setOnClickListener {
            val intent = Intent(this@IdghamMimiActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah4.setOnClickListener {
            val intent = Intent(this@IdghamMimiActivity, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        //InputSuara
        val SuaraMim = MediaPlayer.create(this, R.raw.mim)
        val SuaraMimisatu = MediaPlayer.create(this, R.raw.mimisatu)
        val SuaraMimidua = MediaPlayer.create(this, R.raw.mimidua)

        //VariabelButton
        val ButtonSuara1 = findViewById<View>(R.id.btn_mim) as ImageButton
        val ButtonSuara2 = findViewById<View>(R.id.btn_mimisatu) as ImageButton
        val ButtonSuara3 = findViewById<View>(R.id.btn_mimidua) as ImageButton
        ButtonSuara1.setOnClickListener { SuaraMim.start() }
        ButtonSuara2.setOnClickListener { SuaraMimisatu.start() }
        ButtonSuara3.setOnClickListener { SuaraMimidua.start() }
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