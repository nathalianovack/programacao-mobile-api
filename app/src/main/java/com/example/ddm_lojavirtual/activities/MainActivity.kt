package com.example.ddm_lojavirtual.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ddm_lojavirtual.PaginaDoProduto
import com.example.ddm_lojavirtual.R
import com.example.ddm_lojavirtual.R.layout.activity_main
import com.example.ddm_lojavirtual.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activity_main)

        val bolsamedia = findViewById<Button>(R.id.bolsa)
        bolsamedia.setOnClickListener {
            val paginaDoProduto = Intent(this, PaginaDoProduto::class.java)
            startActivity(paginaDoProduto)
        }
    }
}


//colocar o bottom navigation na minha tela inicial



