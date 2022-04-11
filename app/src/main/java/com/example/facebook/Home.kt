package com.example.facebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    data()
    }

    private fun data() {
        var myArrayList = ArrayList<User>()
        myArrayList.add(User("Abdo Abdo",R.drawable.profile_1,"38 minutes ago",R.drawable.background_1))
        myArrayList.add(User("Ahmed Ezat",R.drawable.profile_2,"2 minutes ago",R.drawable.background_2))
        myArrayList.add(User("Mohamed Hani",R.drawable.profile_3,"8 hour ago",R.drawable.background_3))
        myArrayList.add(User("Mahmoud Ali",R.drawable.profile_4,"2 hour ago",R.drawable.background_4))
        myArrayList.add(User("Iam Alaa Gaber",R.drawable.profile_5,"1 days ago",R.drawable.background_5))
        myArrayList.add(User("Mohamed Omar",R.drawable.profile_6,"30 minutes ago",R.drawable.background_6))
        myArrayList.add(User("Anwar Amer ",R.drawable.profile_7,"3 days ago",R.drawable.background_7))
        myArrayList.add(User("Ahmed Radwan",R.drawable.profile_8,"5 hour ago",R.drawable.background_8))
        myArrayList.add(User("Ragab Mahmoud",R.drawable.profile_9,"59 minutes ago",R.drawable.background_9))

        mRecyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val customAdapter =CustomAdapter(myArrayList)
        mRecyclerView.adapter = customAdapter

    }

}