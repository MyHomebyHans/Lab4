package com.androidhans.lesson3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //STEP1 宣告Intent，透過Intent 從MainActivity切換到SetActivity
        val intent = Intent(this, SecActivity::class.java)
        //STEP2 在Intent夾帶整數資料
        intent.putExtra("Key",123)
        //STEP3 發送Intent
        startActivity(intent)
    }
}