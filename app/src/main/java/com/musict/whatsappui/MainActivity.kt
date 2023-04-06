package com.musict.whatsappui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import com.musict.whatsappui.Adapater.TabAdapter
import com.musict.whatsappui.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    lateinit var  binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        view()



    }
//
//    private fun replaceFragment(chatFragment: Fragment) {
//
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.linear,chatFragment)
//        fragmentTransaction.commit()
//
//
//    }
//











    private fun view() {
//        replaceFragment(Chat())



        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Chats"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Status"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Calls"))

        val adapter = TabAdapter(supportFragmentManager,binding.tabLayout.tabCount)
        binding.viewPager.adapter=adapter

        binding.viewPager.addOnPageChangeListener(TabLayoutOnPageChangeListener(binding.tabLayout))


        binding.tabLayout.addOnTabSelectedListener(object :OnTabSelectedListener{

            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.viewPager.setCurrentItem(tab.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {


            }

            override fun onTabReselected(tab: TabLayout.Tab?) {



            }


        })





    }


}