package com.example.nubank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            //Chama a LoginActivity
            val mIntent= Intent(this,DadosActivity::class.java)
            //método responsável por executar a Intent
            startActivity(mIntent)
            //método responsável por remover a tela da pilha
            finish()
        },3000)//tempo em milisegundos
    }
}