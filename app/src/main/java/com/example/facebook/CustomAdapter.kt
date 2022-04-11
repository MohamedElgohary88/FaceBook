package com.example.facebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CustomAdapter(var myList: ArrayList<User>):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val v =  LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var infUser = myList[position]

      holder.userName.text = infUser.mUserName
      holder.userPhoto.setImageResource(infUser.mUserPhoto)
      holder.timesAgo.text = infUser.mTimesAgo
      holder.postPhoto.setImageResource(infUser.mPostPhoto)

    }

    override fun getItemCount(): Int {
return myList.size
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val userName = itemView.findViewById(R.id.userName) as TextView
        val userPhoto = itemView.findViewById(R.id.userPhoto) as CircleImageView

        val timesAgo = itemView.findViewById(R.id.timesAgo) as TextView
        val postPhoto = itemView.findViewById(R.id.postPhoto) as ImageView



    }
}