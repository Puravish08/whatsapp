package com.musict.whatsappui.Adapater

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.musict.whatsappui.Fragment.CallsFragment
import com.musict.whatsappui.Fragment.ChatFragment
import com.musict.whatsappui.Fragment.StatusFragment

class TabAdapter(supportFragmentManager: FragmentManager,val tabCount: Int) : FragmentPagerAdapter(supportFragmentManager) {

    override fun getCount(): Int {
        return tabCount
    }



    override fun getItem(position: Int): Fragment {

        when(position){
         0->{


             return ChatFragment()
         }

            1->{


                return StatusFragment()

            }

            2->{


                return  CallsFragment()


            }

            else->{


                return ChatFragment()
            }



        }

    }






}