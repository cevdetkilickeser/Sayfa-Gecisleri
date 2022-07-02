package com.example.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfagecisleri.databinding.ActivitySayfaBirBinding

class SayfaBirActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivitySayfaBirBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaBirBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitUc.setOnClickListener {
            val intent = Intent(this@SayfaBirActivity,SayfaUcActivity::class.java)
            startActivity(intent)
        }
    }
}