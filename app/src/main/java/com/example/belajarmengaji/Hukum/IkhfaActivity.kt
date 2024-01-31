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

class IkhfaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikhfa)
        val pindah1 = findViewById<View>(R.id.btn_back) as ImageView
        val pindah2 = findViewById<View>(R.id.btn_kuis) as ImageView
        val pindah3 = findViewById<View>(R.id.btn_home) as ImageView
        val pindah4 = findViewById<View>(R.id.btn_akun) as ImageView
        pindah1.setOnClickListener {
            val intent = Intent(this@IkhfaActivity, HukumNunMatiActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah2.setOnClickListener {
            val intent = Intent(this@IkhfaActivity, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah3.setOnClickListener {
            val intent = Intent(this@IkhfaActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah4.setOnClickListener {
            val intent = Intent(this@IkhfaActivity, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        //InputSuara
        val SuaraTa = MediaPlayer.create(this, R.raw.ta)
        val SuaraTsa = MediaPlayer.create(this, R.raw.tsa)
        val SuaraJim = MediaPlayer.create(this, R.raw.jim)
        val SuaraDal = MediaPlayer.create(this, R.raw.dal)
        val SuaraDzal = MediaPlayer.create(this, R.raw.dzal)
        val SuaraZai = MediaPlayer.create(this, R.raw.zai)
        val SuaraSin = MediaPlayer.create(this, R.raw.sin)
        val SuaraSyin = MediaPlayer.create(this, R.raw.syin)
        val SuaraShad = MediaPlayer.create(this, R.raw.shad)
        val SuaraDhad = MediaPlayer.create(this, R.raw.dhad)
        val SuaraTha = MediaPlayer.create(this, R.raw.tha)
        val SuaraZha = MediaPlayer.create(this, R.raw.zha)
        val SuaraFa = MediaPlayer.create(this, R.raw.fa)
        val SuaraQaf = MediaPlayer.create(this, R.raw.qaf)
        val SuaraKaf = MediaPlayer.create(this, R.raw.kaf)
        val SuaraIkhfasatu = MediaPlayer.create(this, R.raw.ikhfasatu)
        val SuaraIkhfadua = MediaPlayer.create(this, R.raw.ikhfadua)
        val SuaraIkhfatiga = MediaPlayer.create(this, R.raw.ikhfatiga)

        //VariabelButton
        val ButtonSuara1 = findViewById<View>(R.id.btn_ta) as ImageButton
        val ButtonSuara2 = findViewById<View>(R.id.btn_tsa) as ImageButton
        val ButtonSuara3 = findViewById<View>(R.id.btn_jim) as ImageButton
        val ButtonSuara4 = findViewById<View>(R.id.btn_dal) as ImageButton
        val ButtonSuara5 = findViewById<View>(R.id.btn_dzal) as ImageButton
        val ButtonSuara6 = findViewById<View>(R.id.btn_zai) as ImageButton
        val ButtonSuara7 = findViewById<View>(R.id.btn_sin) as ImageButton
        val ButtonSuara8 = findViewById<View>(R.id.btn_syin) as ImageButton
        val ButtonSuara9 = findViewById<View>(R.id.btn_shad) as ImageButton
        val ButtonSuara10 = findViewById<View>(R.id.btn_dhad) as ImageButton
        val ButtonSuara11 = findViewById<View>(R.id.btn_tha) as ImageButton
        val ButtonSuara12 = findViewById<View>(R.id.btn_zha) as ImageButton
        val ButtonSuara13 = findViewById<View>(R.id.btn_fa) as ImageButton
        val ButtonSuara14 = findViewById<View>(R.id.btn_qaf) as ImageButton
        val ButtonSuara15 = findViewById<View>(R.id.btn_kaf) as ImageButton
        val ButtonSuara16 = findViewById<View>(R.id.btn_ikhfasatu) as ImageButton
        val ButtonSuara17 = findViewById<View>(R.id.btn_ikhfadua) as ImageButton
        val ButtonSuara18 = findViewById<View>(R.id.btn_ikhfatiga) as ImageButton
        ButtonSuara1.setOnClickListener { SuaraTa.start() }
        ButtonSuara2.setOnClickListener { SuaraTsa.start() }
        ButtonSuara3.setOnClickListener { SuaraJim.start() }
        ButtonSuara4.setOnClickListener { SuaraDal.start() }
        ButtonSuara5.setOnClickListener { SuaraDzal.start() }
        ButtonSuara6.setOnClickListener { SuaraZai.start() }
        ButtonSuara7.setOnClickListener { SuaraSin.start() }
        ButtonSuara8.setOnClickListener { SuaraSyin.start() }
        ButtonSuara9.setOnClickListener { SuaraShad.start() }
        ButtonSuara10.setOnClickListener { SuaraDhad.start() }
        ButtonSuara11.setOnClickListener { SuaraTha.start() }
        ButtonSuara12.setOnClickListener { SuaraZha.start() }
        ButtonSuara13.setOnClickListener { SuaraFa.start() }
        ButtonSuara14.setOnClickListener { SuaraQaf.start() }
        ButtonSuara15.setOnClickListener { SuaraKaf.start() }
        ButtonSuara16.setOnClickListener { SuaraIkhfasatu.start() }
        ButtonSuara17.setOnClickListener { SuaraIkhfadua.start() }
        ButtonSuara18.setOnClickListener { SuaraIkhfatiga.start() }
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