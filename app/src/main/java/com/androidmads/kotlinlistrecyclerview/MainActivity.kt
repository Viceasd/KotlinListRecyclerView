package com.androidmads.kotlinlistrecyclerview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btnListView).setOnClickListener {
            startActivity(Intent(applicationContext, ListViewActivity::class.java))
        }

        findViewById<Button>(R.id.btnRecView).setOnClickListener {
            startActivity(Intent(applicationContext, RecyclerViewActivity::class.java))
        }
    }
}
