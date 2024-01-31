package com.example.belajarmengaji.Quiz

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.belajarmengaji.R

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)
        val hasil = findViewById<View>(R.id.hasil_kuis) as TextView
        val result = findViewById<View>(R.id.result) as TextView
        val ulangi = findViewById<View>(R.id.btn_ulangi) as Button
        val kembali = findViewById<View>(R.id.btn_kembali) as Button
        hasil.text = """
            Jawaban Benar : ${QuizMengajiActivity.benar}
            Jawaban Salah : ${QuizMengajiActivity.salah}
            """.trimIndent()
        if (QuizMengajiActivity.benar == 10) {
            result.text = "Luar Biasa!!!"
        } else if (QuizMengajiActivity.benar == 9) {
            result.text = "Menakjubkan!!!"
        } else if (QuizMengajiActivity.benar == 8) {
            result.text = "Hebat!!!"
        } else if (QuizMengajiActivity.benar == 7) {
            result.text = "Kerja Bagus!!!"
        } else {
            result.text = "Terus Semangat, Coba Lagi Ya!!!"
        }
        ulangi.setOnClickListener {
            val intent = Intent(applicationContext, QuizMengajiActivity::class.java)
            startActivity(intent)
            finish()
        }
        kembali.setOnClickListener {
            val intent = Intent(this@HasilActivity, MenuQuizActivity::class.java)
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
            .setPositiveButton(
                "OK"
            ) { dialog, which -> finish() }
            .setNegativeButton(
                "Batal"
            ) { dialog, which -> dialog.cancel() }
            .show()
    }
}