package com.example.belajarmengaji

import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.belajarmengaji.Hijaiyah.HijaiyahActivity
import com.example.belajarmengaji.Hukum.HukumBacaMenuActivity
import com.example.belajarmengaji.Profile.MenuProfileActivity
import com.example.belajarmengaji.Quiz.MenuQuizActivity
import com.example.belajarmengaji.Tanda.TandaBarisActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_kuis.setOnClickListener{
            var intent = Intent(this, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_menu_hijaiyah.setOnClickListener{
            var intent = Intent(this, HijaiyahActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_menu_tanda.setOnClickListener{
            var intent = Intent(this, TandaBarisActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_menu_hukum.setOnClickListener{
            var intent = Intent(this, HukumBacaMenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_akun.setOnClickListener{
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