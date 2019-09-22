package com.android.devs.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_select_repair.*

class SelectRepair : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_repair)
        repairs_list.adapter=SelectRepairAdapter(applicationContext)
        repairs_list.layoutManager=GridLayoutManager(applicationContext,2)
        setSupportActionBar(repair_toolbar)
        repair_toolbar

    }
}
