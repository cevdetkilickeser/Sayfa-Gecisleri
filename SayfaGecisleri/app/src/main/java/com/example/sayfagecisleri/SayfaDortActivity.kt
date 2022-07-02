package com.example.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfagecisleri.databinding.ActivitySayfaDortBinding

class SayfaDortActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivitySayfaDortBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaDortBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGeriGit.setOnClickListener {
            val intent = Intent(this@SayfaDortActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}