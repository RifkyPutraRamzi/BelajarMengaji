package com.example.belajarmengaji.Tanda

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.belajarmengaji.HomeActivity
import com.example.belajarmengaji.Profile.MenuProfileActivity
import com.example.belajarmengaji.Quiz.MenuQuizActivity
import com.example.belajarmengaji.R

class TandaWaqafActivity : AppCompatActivity() {
    var TampilGambar: ImageView? = null
    var show: ImageButton? = null
    var hide: ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanda_waqaf)
        val pindah1 = findViewById<View>(R.id.btn_back) as ImageView
        val pindah2 = findViewById<View>(R.id.btn_kuis) as ImageView
        val pindah3 = findViewById<View>(R.id.btn_home) as ImageView
        val pindah4 = findViewById<View>(R.id.btn_akun) as ImageView
        pindah1.setOnClickListener {
            val intent = Intent(this@TandaWaqafActivity, TandaBarisActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah2.setOnClickListener {
            val intent = Intent(this@TandaWaqafActivity, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah3.setOnClickListener {
            val intent = Intent(this@TandaWaqafActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah4.setOnClickListener {
            val intent = Intent(this@TandaWaqafActivity, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
        TampilGambar = findViewById<View>(R.id.pop_btn_twf) as ImageView
        show = findViewById<View>(R.id.btn_lawaqaf) as ImageButton
        hide = findViewById<View>(R.id.btn_solluwaqaf) as ImageButton
        val animScale = AnimationUtils.loadAnimation(this, R.anim.animscale)
        show!!.setOnClickListener { TampilGambar!!.visibility = View.VISIBLE }
        hide!!.setOnClickListener { TampilGambar!!.visibility = View.INVISIBLE }

        //InputSuara
        val SuaraLamwaqaf = MediaPlayer.create(this, R.raw.lamwaqaf)
        val SuaraSolluwaqaf = MediaPlayer.create(this, R.raw.solluwaqaf)
        val SuaraJimwaqaf = MediaPlayer.create(this, R.raw.jimwaqaf)
        val SuaraSinwaqaf = MediaPlayer.create(this, R.raw.sinwaqaf)
        val SuaraMimwaqaf = MediaPlayer.create(this, R.raw.mimwaqaf)
        val SuaraQolawaqaf = MediaPlayer.create(this, R.raw.qolawaqaf)

        //VariabelButton
        val ButtonSuara1 = findViewById<View>(R.id.btn_lawaqaf) as ImageButton
        val ButtonSuara2 = findViewById<View>(R.id.btn_solluwaqaf) as ImageButton
        val ButtonSuara3 = findViewById<View>(R.id.btn_jimwaqaf) as ImageButton
        val ButtonSuara4 = findViewById<View>(R.id.btn_sinwaqaf) as ImageButton
        val ButtonSuara5 = findViewById<View>(R.id.btn_mimwaqaf) as ImageButton
        val ButtonSuara6 = findViewById<View>(R.id.btn_qolawaqaf) as ImageButton
        ButtonSuara1.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.lamwaqaftext)
            TampilGambar!!.startAnimation(animScale)
            SuaraLamwaqaf.start()
        }
        ButtonSuara2.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.solluwaqaftext)
            TampilGambar!!.startAnimation(animScale)
            SuaraSolluwaqaf.start()
        }
        ButtonSuara3.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.jimwaqaftext)
            TampilGambar!!.startAnimation(animScale)
            SuaraJimwaqaf.start()
        }
        ButtonSuara4.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.sinwaqaftext)
            TampilGambar!!.startAnimation(animScale)
            SuaraSinwaqaf.start()
        }
        ButtonSuara5.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.mimwaqaftext)
            TampilGambar!!.startAnimation(animScale)
            SuaraMimwaqaf.start()
        }
        ButtonSuara6.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.qolawaqaftext)
            TampilGambar!!.startAnimation(animScale)
            SuaraQolawaqaf.start()
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