package com.android.devs.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car_viewpager.adapter = TabAdapter(supportFragmentManager)
        car_viewpager.offscreenPageLimit=10
        car_tab_layout.setupWithViewPager(car_viewpager)
        setSupportActionBar(toolbar)


    }
}
