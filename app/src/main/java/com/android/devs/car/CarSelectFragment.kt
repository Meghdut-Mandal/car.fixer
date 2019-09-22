package com.android.devs.car


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.car_select_fragment.*


/**
 * A simple [Fragment] subclass.
 */
class CarSelectFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.car_select_fragment, container, false)

    override fun onResume() {
        super.onResume()
        car_list_recycler_view.adapter = CarListAdapter(context!!,::onSelected)
        car_list_recycler_view.layoutManager = LinearLayoutManager(context)
    }
    fun onSelected()
    {
        val acti=Intent(context,SelectRepair::class.java)
        startActivity(acti)
    }

}
