package com.kim.pizzaorderapp_kim2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.pizzaorderapp_kim2.Adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mMvpa : MainViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
        
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mMvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mMvpa

        mainTabLayout.setupWithViewPager(mainViewPager)

    }


}