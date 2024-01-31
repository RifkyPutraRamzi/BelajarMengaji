package com.example.belajarmengaji.Hijaiyah

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

class HijaiyahActivity : AppCompatActivity() {
    var TampilGambar: ImageView? = null
    var show: ImageButton? = null
    var hide: ImageButton? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hijaiyah)
        val pindah1 = findViewById<View>(R.id.btn_back) as ImageView
        val pindah2 = findViewById<View>(R.id.btn_kuis) as ImageView
        val pindah3 = findViewById<View>(R.id.btn_home) as ImageView
        val pindah4 = findViewById<View>(R.id.btn_akun) as ImageView
        pindah1.setOnClickListener {
            val intent = Intent(this@HijaiyahActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah2.setOnClickListener {
            val intent = Intent(this@HijaiyahActivity, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah3.setOnClickListener {
            val intent = Intent(this@HijaiyahActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah4.setOnClickListener {
            val intent = Intent(this@HijaiyahActivity, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
        TampilGambar = findViewById<View>(R.id.pop_btn_hijaiyah) as ImageView
        show = findViewById<View>(R.id.btn_alif) as ImageButton
        hide = findViewById<View>(R.id.btn_ba) as ImageButton
        val animScale = AnimationUtils.loadAnimation(this, R.anim.animscale)
        show!!.setOnClickListener { TampilGambar!!.visibility = View.VISIBLE }
        hide!!.setOnClickListener { TampilGambar!!.visibility = View.INVISIBLE }

        //InputSuara
        val SuaraAlif = MediaPlayer.create(this, R.raw.alif)
        val SuaraBa = MediaPlayer.create(this, R.raw.ba)
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
        val SuaraMim = MediaPlayer.create(this, R.raw.mim)
        val SuaraNun = MediaPlayer.create(this, R.raw.nun)
        val SuaraWau = MediaPlayer.create(this, R.raw.wau)
        val SuaraHaa = MediaPlayer.create(this, R.raw.haa)
        val SuaraLamalif = MediaPlayer.create(this, R.raw.lamalif)
        val SuaraHamzah = MediaPlayer.create(this, R.raw.hamzah)
        val SuaraYa = MediaPlayer.create(this, R.raw.ya)

        //VariabelButton
        val ButtonSuara1 = findViewById<View>(R.id.btn_alif) as ImageButton
        val ButtonSuara2 = findViewById<View>(R.id.btn_ba) as ImageButton
        val ButtonSuara3 = findViewById<View>(R.id.btn_ta) as ImageButton
        val ButtonSuara4 = findViewById<View>(R.id.btn_tsa) as ImageButton
        val ButtonSuara5 = findViewById<View>(R.id.btn_jim) as ImageButton
        val ButtonSuara6 = findViewById<View>(R.id.btn_ha) as ImageButton
        val ButtonSuara7 = findViewById<View>(R.id.btn_kha) as ImageButton
        val ButtonSuara8 = findViewById<View>(R.id.btn_dal) as ImageButton
        val ButtonSuara9 = findViewById<View>(R.id.btn_dzal) as ImageButton
        val ButtonSuara10 = findViewById<View>(R.id.btn_ra) as ImageButton
        val ButtonSuara11 = findViewById<View>(R.id.btn_zai) as ImageButton
        val ButtonSuara12 = findViewById<View>(R.id.btn_sin) as ImageButton
        val ButtonSuara13 = findViewById<View>(R.id.btn_syin) as ImageButton
        val ButtonSuara14 = findViewById<View>(R.id.btn_shad) as ImageButton
        val ButtonSuara15 = findViewById<View>(R.id.btn_dhad) as ImageButton
        val ButtonSuara16 = findViewById<View>(R.id.btn_tha) as ImageButton
        val ButtonSuara17 = findViewById<View>(R.id.btn_zha) as ImageButton
        val ButtonSuara18 = findViewById<View>(R.id.btn_ain) as ImageButton
        val ButtonSuara19 = findViewById<View>(R.id.btn_ghin) as ImageButton
        val ButtonSuara20 = findViewById<View>(R.id.btn_fa) as ImageButton
        val ButtonSuara21 = findViewById<View>(R.id.btn_qaf) as ImageButton
        val ButtonSuara22 = findViewById<View>(R.id.btn_kaf) as ImageButton
        val ButtonSuara23 = findViewById<View>(R.id.btn_lam) as ImageButton
        val ButtonSuara24 = findViewById<View>(R.id.btn_mim) as ImageButton
        val ButtonSuara25 = findViewById<View>(R.id.btn_nun) as ImageButton
        val ButtonSuara26 = findViewById<View>(R.id.btn_wau) as ImageButton
        val ButtonSuara27 = findViewById<View>(R.id.btn_haa) as ImageButton
        val ButtonSuara28 = findViewById<View>(R.id.btn_lamalif) as ImageButton
        val ButtonSuara29 = findViewById<View>(R.id.btn_hamzah) as ImageButton
        val ButtonSuara30 = findViewById<View>(R.id.btn_ya) as ImageButton
        ButtonSuara1.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.alif)
            TampilGambar!!.startAnimation(animScale)
            SuaraAlif.start()
        }
        ButtonSuara2.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.ba)
            TampilGambar!!.startAnimation(animScale)
            SuaraBa.start()
        }
        ButtonSuara3.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.ta)
            TampilGambar!!.startAnimation(animScale)
            SuaraTa.start()
        }
        ButtonSuara4.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.tsa)
            TampilGambar!!.startAnimation(animScale)
            SuaraTsa.start()
        }
        ButtonSuara5.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.jim)
            TampilGambar!!.startAnimation(animScale)
            SuaraJim.start()
        }
        ButtonSuara6.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.ha)
            TampilGambar!!.startAnimation(animScale)
            SuaraHa.start()
        }
        ButtonSuara7.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.kha)
            TampilGambar!!.startAnimation(animScale)
            SuaraKha.start()
        }
        ButtonSuara8.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.dal)
            TampilGambar!!.startAnimation(animScale)
            SuaraDal.start()
        }
        ButtonSuara9.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.dzal)
            TampilGambar!!.startAnimation(animScale)
            SuaraDzal.start()
        }
        ButtonSuara10.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.ra)
            TampilGambar!!.startAnimation(animScale)
            SuaraRa.start()
        }
        ButtonSuara11.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.zai)
            TampilGambar!!.startAnimation(animScale)
            SuaraZai.start()
        }
        ButtonSuara12.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.sin)
            TampilGambar!!.startAnimation(animScale)
            SuaraSin.start()
        }
        ButtonSuara13.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.syin)
            TampilGambar!!.startAnimation(animScale)
            SuaraSyin.start()
        }
        ButtonSuara14.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.shad)
            TampilGambar!!.startAnimation(animScale)
            SuaraShad.start()
        }
        ButtonSuara15.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.dhad)
            TampilGambar!!.startAnimation(animScale)
            SuaraDhad.start()
        }
        ButtonSuara16.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.tha)
            TampilGambar!!.startAnimation(animScale)
            SuaraTha.start()
        }
        ButtonSuara17.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.zha)
            TampilGambar!!.startAnimation(animScale)
            SuaraZha.start()
        }
        ButtonSuara18.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.ain)
            TampilGambar!!.startAnimation(animScale)
            SuaraAin.start()
        }
        ButtonSuara19.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.ghin)
            TampilGambar!!.startAnimation(animScale)
            SuaraGhin.start()
        }
        ButtonSuara20.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.fa)
            TampilGambar!!.startAnimation(animScale)
            SuaraFa.start()
        }
        ButtonSuara21.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.qaf)
            TampilGambar!!.startAnimation(animScale)
            SuaraQaf.start()
        }
        ButtonSuara22.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.kaf)
            TampilGambar!!.startAnimation(animScale)
            SuaraKaf.start()
        }
        ButtonSuara23.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.lam)
            TampilGambar!!.startAnimation(animScale)
            SuaraLam.start()
        }
        ButtonSuara24.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.mim)
            TampilGambar!!.startAnimation(animScale)
            SuaraMim.start()
        }
        ButtonSuara25.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.nun)
            TampilGambar!!.startAnimation(animScale)
            SuaraNun.start()
        }
        ButtonSuara26.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.wau)
            TampilGambar!!.startAnimation(animScale)
            SuaraWau.start()
        }
        ButtonSuara27.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.haa)
            TampilGambar!!.startAnimation(animScale)
            SuaraHaa.start()
        }
        ButtonSuara28.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.lam_alif)
            TampilGambar!!.startAnimation(animScale)
            SuaraLamalif.start()
        }
        ButtonSuara29.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.hamzah)
            TampilGambar!!.startAnimation(animScale)
            SuaraHamzah.start()
        }
        ButtonSuara30.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.ya)
            TampilGambar!!.startAnimation(animScale)
            SuaraYa.start()
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