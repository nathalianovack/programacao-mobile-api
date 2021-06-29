package com.example.ddm_lojavirtual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ddm_lojavirtual.R.layout.activity_main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val bolsamedia = findViewById(R.id.bolsa) as Button
        bolsamedia.setOnClickListener {
            val paginaDoProduto = Intent(this, PaginaDoProduto::class.java)
            startActivity(paginaDoProduto)
        }
    }

}


