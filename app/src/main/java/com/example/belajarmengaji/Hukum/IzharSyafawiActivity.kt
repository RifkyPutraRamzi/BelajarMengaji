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

class IzharSyafawiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_izhar_syafawi)
        val pindah1 = findViewById<View>(R.id.btn_back) as ImageView
        val pindah2 = findViewById<View>(R.id.btn_kuis) as ImageView
        val pindah3 = findViewById<View>(R.id.btn_home) as ImageView
        val pindah4 = findViewById<View>(R.id.btn_akun) as ImageView
        pindah1.setOnClickListener {
            val intent = Intent(this@IzharSyafawiActivity, HukumMimMatiActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah2.setOnClickListener {
            val intent = Intent(this@IzharSyafawiActivity, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah3.setOnClickListener {
            val intent = Intent(this@IzharSyafawiActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah4.setOnClickListener {
            val intent = Intent(this@IzharSyafawiActivity, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        //InputSuara
        val SuaraAlif = MediaPlayer.create(this, R.raw.alif)
        val SuaraTa = MediaPlayer.create(this, R.raw.ta)
        val SuaraTsa = MediaPlayer.create(this, R.raw.tsa)
        val SuaraJim = MediaPlayer.create(this, R.raw.jim)
        val SuaraHa = MediaPlayer.create(this, R.raw.ha)
        val SuaraKha = MediaPlayer.create(this, R.raw.kha)
        val SuaraDal = MediaPlayer.create(this, R.raw.dal)
        val SuaraDzal = MediaPlayer.create(this, R.raw.dzal)
        val SuaraRa = MediaPlayer.create(this, R.raw.ra)
        val SuaraZai = MediaPlayer.create(this, R.raw.zai)
        val SuaraSin = MediaPlayer.create(this, R.raw.sin)
        val SuaraSyin = MediaPlayer.create(this, R.raw.syin)
        val SuaraShad = MediaPlayer.create(this, R.raw.shad)
        val SuaraDhad = MediaPlayer.create(this, R.raw.dhad)
        val SuaraTha = MediaPlayer.create(this, R.raw.tha)
        val SuaraZha = MediaPlayer.create(this, R.raw.zha)
        val SuaraAin = MediaPlayer.create(this, R.raw.ain)
        val SuaraGhin = MediaPlayer.create(this, R.raw.ghin)
        val SuaraFa = MediaPlayer.create(this, R.raw.fa)
        val SuaraQaf = MediaPlayer.create(this, R.raw.qaf)
        val SuaraKaf = MediaPlayer.create(this, R.raw.kaf)
        val SuaraLam = MediaPlayer.create(this, R.raw.lam)
        val SuaraNun = MediaPlayer.create(this, R.raw.nun)
        val SuaraWau = MediaPlayer.create(this, R.raw.wau)
        val SuaraHaa = MediaPlayer.create(this, R.raw.haa)
        val SuaraLamalif = MediaPlayer.create(this, R.raw.lamalif)
        val SuaraHamzah = MediaPlayer.create(this, R.raw.hamzah)
        val SuaraYa = MediaPlayer.create(this, R.raw.ya)
        val SuaraIzharsyafawisatu = MediaPlayer.create(this, R.raw.izharsyafawisatu)
        val SuaraIzharsyafawidua = MediaPlayer.create(this, R.raw.izharsyafawidua)

        //VariabelButton
        val ButtonSuara1 = findViewById<View>(R.id.btn_alif) as ImageButton
        val ButtonSuara2 = findViewById<View>(R.id.btn_ta) as ImageButton
        val ButtonSuara3 = findViewById<View>(R.id.btn_tsa) as ImageButton
        val ButtonSuara4 = findViewById<View>(R.id.btn_jim) as ImageButton
        val ButtonSuara5 = findViewById<View>(R.id.btn_ha) as ImageButton
        val ButtonSuara6 = findViewById<View>(R.id.btn_kha) as ImageButton
        val ButtonSuara7 = findViewById<View>(R.id.btn_dal) as ImageButton
        val ButtonSuara8 = findViewById<View>(R.id.btn_dzal) as ImageButton
        val ButtonSuara9 = findViewById<View>(R.id.btn_ra) as ImageButton
        val ButtonSuara10 = findViewById<View>(R.id.btn_zai) as ImageButton
        val ButtonSuara11 = findViewById<View>(R.id.btn_sin) as ImageButton
        val ButtonSuara12 = findViewById<View>(R.id.btn_syin) as ImageButton
        val ButtonSuara13 = findViewById<View>(R.id.btn_shad) as ImageButton
        val ButtonSuara14 = findViewById<View>(R.id.btn_dhad) as ImageButton
        val ButtonSuara15 = findViewById<View>(R.id.btn_tha) as ImageButton
        val ButtonSuara16 = findViewById<View>(R.id.btn_zha) as ImageButton
        val ButtonSuara17 = findViewById<View>(R.id.btn_ain) as ImageButton
        val ButtonSuara18 = findViewById<View>(R.id.btn_ghin) as ImageButton
        val ButtonSuara19 = findViewById<View>(R.id.btn_fa) as ImageButton
        val ButtonSuara20 = findViewById<View>(R.id.btn_qaf) as ImageButton
        val ButtonSuara21 = findViewById<View>(R.id.btn_kaf) as ImageButton
        val ButtonSuara22 = findViewById<View>(R.id.btn_lam) as ImageButton
        val ButtonSuara23 = findViewById<View>(R.id.btn_nun) as ImageButton
        val ButtonSuara24 = findViewById<View>(R.id.btn_wau) as ImageButton
        val ButtonSuara25 = findViewById<View>(R.id.btn_haa) as ImageButton
        val ButtonSuara26 = findViewById<View>(R.id.btn_lamalif) as ImageButton
        val ButtonSuara27 = findViewById<View>(R.id.btn_hamzah) as ImageButton
        val ButtonSuara28 = findViewById<View>(R.id.btn_ya) as ImageButton
        val ButtonSuara29 = findViewById<View>(R.id.btn_izharsyafawisatu) as ImageButton
        val ButtonSuara30 = findViewById<View>(R.id.btn_izharsyafawidua) as ImageButton
        ButtonSuara1.setOnClickListener { SuaraAlif.start() }
        ButtonSuara2.setOnClickListener { SuaraTa.start() }
        ButtonSuara3.setOnClickListener { SuaraTsa.start() }
        ButtonSuara4.setOnClickListener { SuaraJim.start() }
        ButtonSuara5.setOnClickListener { SuaraHa.start() }
        ButtonSuara6.setOnClickListener { SuaraKha.start() }
        ButtonSuara7.setOnClickListener { SuaraDal.start() }
        ButtonSuara8.setOnClickListener { SuaraDzal.start() }
        ButtonSuara9.setOnClickListener { SuaraRa.start() }
        ButtonSuara10.setOnClickListener { SuaraZai.start() }
        ButtonSuara11.setOnClickListener { SuaraSin.start() }
        ButtonSuara12.setOnClickListener { SuaraSyin.start() }
        ButtonSuara13.setOnClickListener { SuaraShad.start() }
        ButtonSuara14.setOnClickListener { SuaraDhad.start() }
        ButtonSuara15.setOnClickListener { SuaraTha.start() }
        ButtonSuara16.setOnClickListener { SuaraZha.start() }
        ButtonSuara17.setOnClickListener { SuaraAin.start() }
        ButtonSuara18.setOnClickListener { SuaraGhin.start() }
        ButtonSuara19.setOnClickListener { SuaraFa.start() }
        ButtonSuara20.setOnClickListener { SuaraQaf.start() }
        ButtonSuara21.setOnClickListener { SuaraKaf.start() }
        ButtonSuara22.setOnClickListener { SuaraLam.start() }
        ButtonSuara23.setOnClickListener { SuaraNun.start() }
        ButtonSuara24.setOnClickListener { SuaraWau.start() }
        ButtonSuara25.setOnClickListener { SuaraHaa.start() }
        ButtonSuara26.setOnClickListener { SuaraLamalif.start() }
        ButtonSuara27.setOnClickListener { SuaraHamzah.start() }
        ButtonSuara28.setOnClickListener { SuaraYa.start() }
        ButtonSuara29.setOnClickListener { SuaraIzharsyafawisatu.start() }
        ButtonSuara30.setOnClickListener { SuaraIzharsyafawidua.start() }
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