package com.example.belajarmengaji.Quiz

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.belajarmengaji.R

class QuizMengajiActivity : AppCompatActivity() {
    var soal: TextView? = null
    var rg: RadioGroup? = null
    var PilihanA: RadioButton? = null
    var PilihanB: RadioButton? = null
    var PilihanC: RadioButton? = null
    var PilihanD: RadioButton? = null
    var PilihanE: RadioButton? = null
    var nomor = 0

    //Pertanyaan
    var pertanyaan_kuis = arrayOf(
        "1. Salah satu huruf Izhar adalah...",
        "2. Yang merupakan huruf Idgham Mutamasilain adalah...",
        "3. Ikhfa artinya adalah...",
        "4. Tanda Dilarang Berhenti adalah merupakan tanda waqaf...",
        "5. Izhar artinya adalah ..",
        "6. \"AN\" merupakan penyebutan dari... ",
        "7. Ada berapa banyak tanda waqaf...",
        "8. Dalam hukum nun mati idgham terbagi menjadi dua, yaitu...",
        "9. Berapakah total semua huruf hijaiyah...",
        "10. \"U\" merupakan penyebutan dari..."
    )

    //Pilihan Jawaban
    var pilihan_jawaban = arrayOf(
        "Ba",
        "Tha",
        "Alif",
        "Kha",
        "Shad",
        "Mim",
        "Ba",
        "Ta",
        "Dhad",
        "Ain",
        "Jelas",
        "Samar",
        "Dengung",
        "Tidak Jelas",
        "Tidak Samar",
        "Nun Waqaf",
        "Lam Waqaf",
        "Sin Waqaf",
        "Jim Waqaf",
        "Sollu Waqaf",
        "Jelas",
        "Samar",
        "Dengung",
        "Tidak Jelas",
        "Tidak Samar",
        "Sukun",
        "Tasydid",
        "Dhammahtain",
        "Fathahtain",
        "Kasrahtain",
        "4",
        "5",
        "6",
        "7",
        "8",
        "Bilaghunnah dan Bighunnah",
        "Bighunnah dan Mutamasillain",
        "Bilaghunnah dan Mutamasilain",
        "Mutamasilain dan Syafawi",
        "Bighunnah dan Halqi",
        "28",
        "29",
        "30",
        "31",
        "32",
        "Kasrah",
        "Fathahtain",
        "Tasydid",
        "Dhammah",
        "Dhammahtain"
    )

    //Jawaban Benar
    var jawaban_benar = arrayOf(
        "Alif",
        "Mim",
        "Samar",
        "Lam Waqaf",
        "Jelas",
        "Fathahtain",
        "6",
        "Bilaghunnah dan Bighunnah",
        "30",
        "Dhammah"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_mengaji)
        soal = findViewById<View>(R.id.soal_kuis) as TextView
        rg = findViewById<View>(R.id.pilihan) as RadioGroup
        PilihanA = findViewById<View>(R.id.pilihanA) as RadioButton
        PilihanB = findViewById<View>(R.id.pilihanB) as RadioButton
        PilihanC = findViewById<View>(R.id.pilihanC) as RadioButton
        PilihanD = findViewById<View>(R.id.pilihanD) as RadioButton
        PilihanE = findViewById<View>(R.id.pilihanE) as RadioButton
        soal!!.text = pertanyaan_kuis[nomor]
        PilihanA!!.text = pilihan_jawaban[0]
        PilihanB!!.text = pilihan_jawaban[1]
        PilihanC!!.text = pilihan_jawaban[2]
        PilihanD!!.text = pilihan_jawaban[3]
        PilihanE!!.text = pilihan_jawaban[4]
        rg!!.check(0)
        benar = 0
        salah = 0
    }

    fun next(view: View?) {
        if (PilihanA!!.isChecked || PilihanB!!.isChecked || PilihanC!!.isChecked || PilihanD!!.isChecked) {
            val jawaban_user = findViewById<View>(rg!!.checkedRadioButtonId) as RadioButton
            val ambil_jawaban_user = jawaban_user.text.toString()
            rg!!.check(0)
            if (ambil_jawaban_user.equals(
                    jawaban_benar[nomor],
                    ignoreCase = true
                )
            ) benar++ else salah++
            nomor++
            if (nomor < pertanyaan_kuis.size) {
                soal!!.text = pertanyaan_kuis[nomor]
                PilihanA!!.text = pilihan_jawaban[nomor * 5 + 0]
                PilihanB!!.text = pilihan_jawaban[nomor * 5 + 1]
                PilihanC!!.text = pilihan_jawaban[nomor * 5 + 2]
                PilihanD!!.text = pilihan_jawaban[nomor * 5 + 3]
                PilihanE!!.text = pilihan_jawaban[nomor * 5 + 4]
            } else {
                val selesai = Intent(applicationContext, HasilActivity::class.java)
                startActivity(selesai)
                finish()
            }
        } else {
            Toast.makeText(this, "Harus Jawab Terlebih Dahulu", Toast.LENGTH_SHORT).show()
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

    companion object {
        var benar = 0
        var salah = 0
    }
}