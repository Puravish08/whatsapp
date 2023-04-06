package com.musict.whatsappui.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.musict.whatsappui.R

class ChatAdapter(var imagelist: ArrayList<Int>, var namelist: ArrayList<String>, var subnamelist: ArrayList<String>) :
    RecyclerView.Adapter<ChatAdapter.myViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {


        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.chatlist,parent,false)
        return myViewHolder(itemView)

    }

    override fun getItemCount(): Int {

        return imagelist.size

    }


    override fun onBindViewHolder(holder: myViewHolder, position: Int) {




        holder.img.setImageResource(imagelist[position])
        holder.title.setText(namelist[position])
        holder.subname.setText(subnamelist[position])






    }





    class myViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {


        val img :    ShapeableImageView = itemView.findViewById(R.id.img)
        val title :    TextView = itemView.findViewById(R.id.txttitle)
        val subname :    TextView = itemView.findViewById(R.id.txtSubname)



    }



}