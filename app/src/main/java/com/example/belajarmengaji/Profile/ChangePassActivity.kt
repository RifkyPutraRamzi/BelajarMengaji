package com.example.belajarmengaji.Profile

import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.belajarmengaji.HomeActivity
import com.example.belajarmengaji.Quiz.MenuQuizActivity
import com.example.belajarmengaji.R
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_change_pass.*
import kotlinx.android.synthetic.main.activity_change_pass.btn_akun
import kotlinx.android.synthetic.main.activity_change_pass.btn_home
import kotlinx.android.synthetic.main.activity_change_pass.btn_kuis

class ChangePassActivity : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_pass)

        auth = FirebaseAuth.getInstance()

        btn_back.setOnClickListener {
            var intent = Intent(this, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

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

        btn_akun.setOnClickListener {
            var intent = Intent(this, MenuProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_changePassword.setOnClickListener {
            val old = txt_oldPassword.text.toString().trim()
            val new = txt_newPassword.text.toString().trim()
            val confirm = txt_confirmPassword.text.toString().trim()

            if (old.isEmpty()){
                txt_oldPassword.error = "Field Harus Di isi!"
                txt_oldPassword.requestFocus()
            } else if (new.isEmpty()){
                txt_newPassword.error = "Field Harus Di isi!"
                txt_newPassword.requestFocus()
            } else if(confirm.isEmpty()){
                txt_confirmPassword.error = "Field Harus Di isi!"
                txt_confirmPassword.requestFocus()
            }
            changePassword()
        }
    }

    private fun changePassword() {
        if (txt_newPassword.text.toString().equals(txt_confirmPassword.text.toString())) {
            val user = auth.currentUser
            if (user != null && user.email != null) {
                val credential = EmailAuthProvider
                    .getCredential(user.email!!, txt_oldPassword.text.toString())

                user?.reauthenticate(credential)
                    ?.addOnCompleteListener {
                        if (it.isSuccessful) {
                            Toast.makeText(this, "Autentikasi Berhasil.", Toast.LENGTH_SHORT).show()
                            user?.updatePassword(txt_newPassword.text.toString())
                                ?.addOnCompleteListener { task ->
                                    if (task.isSuccessful) {
                                        Toast.makeText(
                                            this,
                                            "Ubah Kata Sandi Berhasil.",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                        txt_oldPassword.text.clear()
                                        txt_newPassword.text.clear()
                                        txt_confirmPassword.text.clear()
                                    }
                                }
                        } else {
                            Toast.makeText(this, "Autentikasi Tidak Berhasil.", Toast.LENGTH_SHORT)
                                .show()
                        }
                    }
            }
        } else {
            Toast.makeText(this, "Kata Sandi Tidak Sesuai.", Toast.LENGTH_SHORT).show()
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