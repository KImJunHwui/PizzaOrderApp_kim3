package com.kim.pizzaorderapp_kim2.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kim.pizzaorderapp_kim2.Fragments.ChickenListFragment
import com.kim.pizzaorderapp_kim2.Fragments.PizzaListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){

            0 -> "치킨 가게"
            else -> "피자 가게"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PizzaListFragment()
            else -> ChickenListFragment()

        }
    }
}