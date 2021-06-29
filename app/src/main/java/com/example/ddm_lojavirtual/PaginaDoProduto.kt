package com.example.ddm_lojavirtual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaginaDoProduto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_do_produto)

        val login = findViewById(R.id.login) as Button
        login.setOnClickListener{
            val login = Intent(this, Login::class.java)
            startActivity(login)
        }
    }
}