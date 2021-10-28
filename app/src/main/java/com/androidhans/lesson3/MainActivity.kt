package com.androidhans.lesson3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

        //覆蓋活動結果（請求代碼：Int，結果代碼：Int，數據：意圖？）
        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
            //判斷data不為空 並檢查是否夾帶資料
            data?.extras?.let {
                //驗證發出對象，確認 SecActivity 執行的狀態 活動.結果_確認
                if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
                    //讀取 Bundle捆內資料
                    findViewById<TextView>(R.id.tv_meal).text =
                        "飲料: ${it.getString("飲料")}\n\n" +
                                "甜度: ${it.getString("甜度")}\n\n" +
                                "冰塊: ${it.getString("冰塊")}"

                }
            }
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //查找按ID<類型>(id名稱).並監聽按鍵是否按下
        findViewById<Button>(R.id.btn_choice).setOnClickListener {
            //透過 Intent 切換至 SecActivity 並傳遞 requestCode 作為識別編號
            val intent = Intent(this, SecActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }
    }
