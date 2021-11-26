package com.project.fortesting

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.MyListView)
        val redColor = Color.parseColor("#ff000")
        listView.setBackgroundColor(redColor)


            listView.adapter = CustomListview(this)

    }

    private class CustomListview(context: Context) : BaseAdapter() {

        private val mContext = context



        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, convertView: View?, viewGroup: ViewGroup?): View {

            val textView = TextView(mContext)
            textView.text = "This is Listview"

            return textView

        }

        override fun getItem(p0: Int): Any {
            return "Hello"
        }

        override fun getCount(): Int {
            return 5
        }
    }


}