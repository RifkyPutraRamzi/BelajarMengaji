package com.example.belajarmengaji.Profile

import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.belajarmengaji.HomeActivity
import com.example.belajarmengaji.Quiz.MenuQuizActivity
import com.example.belajarmengaji.R
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        btn_home.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_kuis.setOnClickListener {
            var intent = Intent(this, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_back.setOnClickListener {
            var intent = Intent(this, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_akun.setOnClickListener {
            var intent = Intent(this, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    override fun onBackPressed() {
        val keluar = MediaPlayer.create(this, R.raw.keluar)
        keluar.start()
        AlertDialog.Builder(this)
            .setIcon(R.mipmap.ic_launcher)
            .setTitle(R.string.app_name)
            .setMessage("Apakah Kamu Ingin Keluar Aplikasi?")
            .setPositiveButton("OK", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    finish()
                }
            })
            .setNegativeButton("Batal", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    dialog?.cancel()
                }
            })
            .show()
    }
}