package com.example.telegram_task3.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_task3.R
import com.example.telegram_task3.adapter.ImgAdapter
import com.example.telegram_task3.model.Img

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)

        recyclerView.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)

        val adapter = ImgAdapter(prepareImgList())

        recyclerView.adapter = adapter

    }

    private fun prepareImgList(): List<Img> {
        val list = ArrayList<Img>()

        list.add(Img(R.drawable.first))
        list.add(Img(R.drawable.second))
        list.add(Img(R.drawable.third))
        list.add(Img(R.drawable.fouth))

        return list
    }


}