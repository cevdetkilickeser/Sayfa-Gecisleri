package com.example.sayfagecisleri

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfagecisleri.databinding.ActivitySayfaUcBinding

class SayfaUcActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivitySayfaUcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaUcBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitDort2.setOnClickListener {
            val intent = Intent(this@SayfaUcActivity,SayfaDortActivity::class.java)
            startActivity(intent)
        }
    }
}