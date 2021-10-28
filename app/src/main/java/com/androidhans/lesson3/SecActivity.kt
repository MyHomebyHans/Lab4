package com.androidhans.lesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)
        /*
        intene?.extras?.let      //判斷Intent不為空，並檢查是否夾帶資料

        val value = it.getInt("Key")  //以Key取得對資料
        */

    }
}