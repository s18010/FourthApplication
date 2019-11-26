package com.example.fourthapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val fragment = titleFragment as? TitleFragment
        fragment?.setTitle("図鑑一覧")

        backButton.setOnClickListener { finish() }
    }
}
