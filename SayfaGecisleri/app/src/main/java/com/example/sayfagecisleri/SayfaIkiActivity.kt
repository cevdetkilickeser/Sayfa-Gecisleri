package com.example.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfagecisleri.databinding.ActivitySayfaIkiBinding

class SayfaIkiActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivitySayfaIkiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaIkiBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitDort.setOnClickListener {
            val intent = Intent(this@SayfaIkiActivity,SayfaDortActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}