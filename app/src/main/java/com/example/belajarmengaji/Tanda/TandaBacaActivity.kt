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

class TandaBacaActivity : AppCompatActivity() {
    var TampilGambar: ImageView? = null
    var show: ImageButton? = null
    var hide: ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanda_baca)
        val pindah1 = findViewById<View>(R.id.btn_back) as ImageView
        val pindah2 = findViewById<View>(R.id.btn_kuis) as ImageView
        val pindah3 = findViewById<View>(R.id.btn_home) as ImageView
        val pindah4 = findViewById<View>(R.id.btn_akun) as ImageView
        pindah1.setOnClickListener {
            val intent = Intent(this@TandaBacaActivity, TandaBarisActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah2.setOnClickListener {
            val intent = Intent(this@TandaBacaActivity, MenuQuizActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah3.setOnClickListener {
            val intent = Intent(this@TandaBacaActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        pindah4.setOnClickListener {
            val intent = Intent(this@TandaBacaActivity, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
        TampilGambar = findViewById<View>(R.id.pop_btn_tbc) as ImageView
        show = findViewById<View>(R.id.btn_fathah) as ImageButton
        hide = findViewById<View>(R.id.btn_kasrah) as ImageButton
        val animScale = AnimationUtils.loadAnimation(this, R.anim.animscale)
        show!!.setOnClickListener { TampilGambar!!.visibility = View.VISIBLE }
        hide!!.setOnClickListener { TampilGambar!!.visibility = View.INVISIBLE }

        //InputSuara
        val SuaraFathah = MediaPlayer.create(this, R.raw.fathah)
        val SuaraKasrah = MediaPlayer.create(this, R.raw.kasrah)
        val SuaraDhammah = MediaPlayer.create(this, R.raw.dhammah)
        val SuaraFathahtain = MediaPlayer.create(this, R.raw.fathahtain)
        val SuaraKasrahtain = MediaPlayer.create(this, R.raw.kasrahtain)
        val SuaraDhammahtain = MediaPlayer.create(this, R.raw.dhammahtain)
        val SuaraSukun = MediaPlayer.create(this, R.raw.sukun)
        val SuaraTasydid = MediaPlayer.create(this, R.raw.tasydid)
        val SuaraFathahsatu = MediaPlayer.create(this, R.raw.fathahsatu)
        val SuaraFathahdua = MediaPlayer.create(this, R.raw.fathahdua)
        val SuaraFathahtiga = MediaPlayer.create(this, R.raw.fathahtiga)
        val SuaraKasrahsatu = MediaPlayer.create(this, R.raw.kasrahsatu)
        val SuaraKasrahdua = MediaPlayer.create(this, R.raw.kasrahdua)
        val SuaraKasrahtiga = MediaPlayer.create(this, R.raw.kasrahtiga)
        val SuaraDhammahsatu = MediaPlayer.create(this, R.raw.dhammahsatu)
        val SuaraDhammahdua = MediaPlayer.create(this, R.raw.dhammahdua)
        val SuaraDhammahtiga = MediaPlayer.create(this, R.raw.dhammahtiga)
        val SuaraFathahtainsatu = MediaPlayer.create(this, R.raw.fathahtainsatu)
        val SuaraFathahtaindua = MediaPlayer.create(this, R.raw.fathahtaindua)
        val SuaraFathahtaintiga = MediaPlayer.create(this, R.raw.fathahtaintiga)
        val SuaraKasrahtainsatu = MediaPlayer.create(this, R.raw.kasrahtainsatu)
        val SuaraKasrahtaindua = MediaPlayer.create(this, R.raw.kasrahtaindua)
        val SuaraKasrahtaintiga = MediaPlayer.create(this, R.raw.kasrahtaintiga)
        val SuaraDhammahtainsatu = MediaPlayer.create(this, R.raw.dhammahtainsatu)
        val SuaraDhammahtaindua = MediaPlayer.create(this, R.raw.dhammahtaindua)
        val SuaraDhammahtaintiga = MediaPlayer.create(this, R.raw.dhammahtaintiga)
        val SuaraSukunsatu = MediaPlayer.create(this, R.raw.sukunsatu)
        val SuaraSukundua = MediaPlayer.create(this, R.raw.sukundua)
        val SuaraSukuntiga = MediaPlayer.create(this, R.raw.sukuntiga)
        val SuaraTasydidsatu = MediaPlayer.create(this, R.raw.tasydidsatu)
        val SuaraTasydiddua = MediaPlayer.create(this, R.raw.tasydiddua)
        val SuaraTasydidtiga = MediaPlayer.create(this, R.raw.tasydidtiga)

        //VariabelButton
        val ButtonSuara1 = findViewById<View>(R.id.btn_fathah) as ImageButton
        val ButtonSuara2 = findViewById<View>(R.id.btn_kasrah) as ImageButton
        val ButtonSuara3 = findViewById<View>(R.id.btn_dhammah) as ImageButton
        val ButtonSuara4 = findViewById<View>(R.id.btn_an) as ImageButton
        val ButtonSuara5 = findViewById<View>(R.id.btn_in) as ImageButton
        val ButtonSuara6 = findViewById<View>(R.id.btn_un) as ImageButton
        val ButtonSuara7 = findViewById<View>(R.id.btn_sukun) as ImageButton
        val ButtonSuara8 = findViewById<View>(R.id.btn_tasydid) as ImageButton
        val ButtonSuara9 = findViewById<View>(R.id.btn_fathahsatu) as ImageButton
        val ButtonSuara10 = findViewById<View>(R.id.btn_fathahdua) as ImageButton
        val ButtonSuara11 = findViewById<View>(R.id.btn_fathahtiga) as ImageButton
        val ButtonSuara12 = findViewById<View>(R.id.btn_kasrahsatu) as ImageButton
        val ButtonSuara13 = findViewById<View>(R.id.btn_kasrahdua) as ImageButton
        val ButtonSuara14 = findViewById<View>(R.id.btn_kasrahtiga) as ImageButton
        val ButtonSuara15 = findViewById<View>(R.id.btn_dhammahsatu) as ImageButton
        val ButtonSuara16 = findViewById<View>(R.id.btn_dhammahdua) as ImageButton
        val ButtonSuara17 = findViewById<View>(R.id.btn_dhammahtiga) as ImageButton
        val ButtonSuara18 = findViewById<View>(R.id.btn_fathahtainsatu) as ImageButton
        val ButtonSuara19 = findViewById<View>(R.id.btn_fathahtaindua) as ImageButton
        val ButtonSuara20 = findViewById<View>(R.id.btn_fathahtaintiga) as ImageButton
        val ButtonSuara21 = findViewById<View>(R.id.btn_kasrahtainsatu) as ImageButton
        val ButtonSuara22 = findViewById<View>(R.id.btn_kasrahtaindua) as ImageButton
        val ButtonSuara23 = findViewById<View>(R.id.btn_kasrahtaintiga) as ImageButton
        val ButtonSuara24 = findViewById<View>(R.id.btn_dhammahtainsatu) as ImageButton
        val ButtonSuara25 = findViewById<View>(R.id.btn_dhammahtaindua) as ImageButton
        val ButtonSuara26 = findViewById<View>(R.id.btn_dhammahtaintiga) as ImageButton
        val ButtonSuara27 = findViewById<View>(R.id.btn_sukunsatu) as ImageButton
        val ButtonSuara28 = findViewById<View>(R.id.btn_sukundua) as ImageButton
        val ButtonSuara29 = findViewById<View>(R.id.btn_sukuntiga) as ImageButton
        val ButtonSuara30 = findViewById<View>(R.id.btn_tasydidsatu) as ImageButton
        val ButtonSuara31 = findViewById<View>(R.id.btn_tasydiddua) as ImageButton
        val ButtonSuara32 = findViewById<View>(R.id.btn_tasydidtiga) as ImageButton
        ButtonSuara1.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.fathah)
            TampilGambar!!.startAnimation(animScale)
            SuaraFathah.start()
        }
        ButtonSuara2.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.kasrah)
            TampilGambar!!.startAnimation(animScale)
            SuaraKasrah.start()
        }
        ButtonSuara3.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.dhammah)
            TampilGambar!!.startAnimation(animScale)
            SuaraDhammah.start()
        }
        ButtonSuara4.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.an)
            TampilGambar!!.startAnimation(animScale)
            SuaraFathahtain.start()
        }
        ButtonSuara5.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.`in`)
            TampilGambar!!.startAnimation(animScale)
            SuaraKasrahtain.start()
        }
        ButtonSuara6.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.un)
            TampilGambar!!.startAnimation(animScale)
            SuaraDhammahtain.start()
        }
        ButtonSuara7.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.sukun)
            TampilGambar!!.startAnimation(animScale)
            SuaraSukun.start()
        }
        ButtonSuara8.setOnClickListener {
            TampilGambar!!.setImageResource(R.drawable.tasydid)
            TampilGambar!!.startAnimation(animScale)
            SuaraTasydid.start()
        }
        ButtonSuara9.setOnClickListener { SuaraFathahsatu.start() }
        ButtonSuara10.setOnClickListener { SuaraFathahdua.start() }
        ButtonSuara11.setOnClickListener { SuaraFathahtiga.start() }
        ButtonSuara12.setOnClickListener { SuaraKasrahsatu.start() }
        ButtonSuara13.setOnClickListener { SuaraKasrahdua.start() }
        ButtonSuara14.setOnClickListener { SuaraKasrahtiga.start() }
        ButtonSuara15.setOnClickListener { SuaraDhammahsatu.start() }
        ButtonSuara16.setOnClickListener { SuaraDhammahdua.start() }
        ButtonSuara17.setOnClickListener { SuaraDhammahtiga.start() }
        ButtonSuara18.setOnClickListener { SuaraFathahtainsatu.start() }
        ButtonSuara19.setOnClickListener { SuaraFathahtaindua.start() }
        ButtonSuara20.setOnClickListener { SuaraFathahtaintiga.start() }
        ButtonSuara21.setOnClickListener { SuaraKasrahtainsatu.start() }
        ButtonSuara22.setOnClickListener { SuaraKasrahtaindua.start() }
        ButtonSuara23.setOnClickListener { SuaraKasrahtaintiga.start() }
        ButtonSuara24.setOnClickListener { SuaraDhammahtainsatu.start() }
        ButtonSuara25.setOnClickListener { SuaraDhammahtaindua.start() }
        ButtonSuara26.setOnClickListener { SuaraDhammahtaintiga.start() }
        ButtonSuara27.setOnClickListener { SuaraSukunsatu.start() }
        ButtonSuara28.setOnClickListener { SuaraSukundua.start() }
        ButtonSuara29.setOnClickListener { SuaraSukuntiga.start() }
        ButtonSuara30.setOnClickListener { SuaraTasydidsatu.start() }
        ButtonSuara31.setOnClickListener { SuaraTasydiddua.start() }
        ButtonSuara32.setOnClickListener { SuaraTasydidtiga.start() }
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