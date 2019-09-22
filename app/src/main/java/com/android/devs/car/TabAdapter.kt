package com.android.devs.car

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TabAdapter(val fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager) {

    override fun getPageTitle(position: Int): CharSequence? = titleList[position]

    private val titleList = listOf("Sedan", "SUV", "Hatchback", "Luxury")
    private val fragmentList = (1..4).map { CarSelectFragment() }

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getCount(): Int = titleList.size

}