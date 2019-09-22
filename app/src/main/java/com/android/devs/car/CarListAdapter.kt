package com.android.devs.car

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.single_car.view.*

data class CarDetails(val name: String, val model: String, val resID: Int)

class CarViewHolder(val root: View) : RecyclerView.ViewHolder(root) {
    fun bindView(carDetails: CarDetails) {
        Glide.with(root.context).load(carDetails.resID).into(root.car_image)
        root.car_name.text = carDetails.name
        root.car_varient.text = carDetails.model
    }
}

class CarListAdapter(val context: Context, val onclick: () -> Unit) :
    RecyclerView.Adapter<CarViewHolder>() {

    val carList = listOf(
        CarDetails("Hyundai Elite ", "i20 ", R.drawable.hyundai_eite_i20),
        CarDetails("Hyundai Grand ", "i10 ", R.drawable.hyundai_grand_i10),
        CarDetails("Maruti Suzuki", "Alto ", R.drawable.maruti_suzuki_alto),
        CarDetails("Renault Triber", "Ax30 ", R.drawable.renault_triber),
        CarDetails("Renault Kwid", "BXKO", R.drawable.renault_kwid),
        CarDetails("Maruti Suzuki", "Swift", R.drawable.maruti_suzuki_new_swift),
        CarDetails("Hyundai Grand  ", "i10 NIOS", R.drawable.hyundai_grand_i10_nios),
        CarDetails("Renault Triber", "i10 ", R.drawable.renault_triber),
        CarDetails("Maruti Suzuki", "Baleno", R.drawable.hyundai_grand_i10)
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val root = LayoutInflater.from(context).inflate(R.layout.single_car, parent, false)
        return CarViewHolder(root)
    }

    override fun getItemCount(): Int = carList.size

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.root.setOnClickListener { onclick() }
        holder.root.car_name.setOnClickListener { onclick() }
        holder.root.car_varient.setOnClickListener { onclick() }
        holder.root.car_image.setOnClickListener { onclick() }


        holder.bindView(carList[position])
    }
}