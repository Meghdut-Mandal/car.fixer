package com.android.devs.car

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.replair_item.view.*

data class CarRepairItem(val name: String, val description: String, val resId: Int)
class SelectRepairAdapter(val context: Context) : RecyclerView.Adapter<CarRepairViewHolder>() {
    private val listOfRepair = listOf(
        CarRepairItem("Car handel repair","used to repair holes",R.drawable.thermostat)
        ,CarRepairItem("Car handel repair 1","used to repair holes",R.drawable.thermostat)
        ,CarRepairItem("Car handel repair 2","used to repair holes",R.drawable.thermostat)
        ,CarRepairItem("Car handel repair4","used to repair holes",R.drawable.thermostat),
        CarRepairItem("Car handel repair5", "used to repair holes", R.drawable.thermostat)
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarRepairViewHolder {
        val root = LayoutInflater.from(context).inflate(R.layout.replair_item, parent, false)
        return CarRepairViewHolder(root)
    }

    override fun getItemCount(): Int = listOfRepair.size

    override fun onBindViewHolder(holder: CarRepairViewHolder, position: Int) {
        holder.bindData(listOfRepair[position])
    }

}

class CarRepairViewHolder(val rootView: View) : RecyclerView.ViewHolder(rootView) {
    fun bindData(carRepairItem: CarRepairItem) {
        rootView.repair_description.text = carRepairItem.description
        Glide.with(rootView.repair_image.context).load(carRepairItem.resId)
            .into(rootView.repair_image)
        rootView.repair_name.text=carRepairItem.name
    }
}
