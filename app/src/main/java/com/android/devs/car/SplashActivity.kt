package com.android.devs.car

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread {
            Thread.sleep(2000)
            startActivity(Intent(this, MainActivity::class.java))
        }.start()
    }
}
