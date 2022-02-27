package com.example.exploringlayoutsproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        fun loadConstraintLayout (v: View) {
//            setContentView(R.layout.constraint_layout)
//        }

//        fun loadTableLayout(v: View) {
//            setContentView(R.layout.table_layout)
//        }
    }

    fun loadConstrainLayout(view: View) {
        setContentView(R.layout.constraint_layout)
    }

    fun loadTableLayout(view: View) {
        setContentView(R.layout.table_layout)
    }

    fun loadMenuLayout(view: View) {
        setContentView(R.layout.activity_main)
    }
}