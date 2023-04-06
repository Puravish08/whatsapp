package com.musict.whatsappui.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.musict.whatsappui.Adapter.ChatAdapter
import com.musict.whatsappui.R
import com.musict.whatsappui.databinding.FragmentChatBinding

@Suppress("UNREACHABLE_CODE")
class ChatFragment : Fragment() {


    lateinit var chatBinding: FragmentChatBinding


    var imageList= ArrayList<Int>()
    var nameList = ArrayList<String>()
    var subNameList = ArrayList<String>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        chatBinding = FragmentChatBinding.inflate(layoutInflater, container, false)


        initview()

        return chatBinding.root


    }

    private fun initview() {

        info()
        val adapter = ChatAdapter(imageList, nameList, subNameList)


        chatBinding.rcvview.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        chatBinding.rcvview.adapter = adapter

    }

    private fun info() {



        imageList.clear()

        imageList.clear()



        imageList.add(R.drawable.ph1)
        imageList.add(R.drawable.p2)
        imageList.add(R.drawable.ph3)
        imageList.add(R.drawable.ph4)
        imageList.add(R.drawable.ph5)
        imageList.add(R.drawable.ph6)
        imageList.add(R.drawable.ph7)
        imageList.add(R.drawable.ph8)
        imageList.add(R.drawable.ph9)
        imageList.add(R.drawable.ph10)



        nameList.clear()

        nameList.add("person1")
        nameList.add("person2")
        nameList.add("person3")
        nameList.add("person4")
        nameList.add("person5")
        nameList.add("person6")
        nameList.add("person7")
        nameList.add("person8")
        nameList.add("person9")
        nameList.add("person10")




        subNameList.clear()

        subNameList.add(" Emiavay Bantay")
        subNameList.add("jackalin")
        subNameList.add("amitab bachan")
        subNameList.add("sneah bahat")
        subNameList.add("carzy boy")
        subNameList.add("Roman raince")
        subNameList.add("Blcker")
        subNameList.add("Monster")
        subNameList.add("Killer Boy")
        subNameList.add("Robo king")



    }










}