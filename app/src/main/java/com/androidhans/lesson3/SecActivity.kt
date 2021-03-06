package com.androidhans.lesson3

import  android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

       //將變數與 XML 元件綁定
    val btn_send = findViewById<Button>(R.id.btn_send)
    val ed_drink = findViewById<EditText>(R.id.ed_drink)
    val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
    val radioGroup2 = findViewById<RadioGroup>(R.id.radioGroup2)

    //send鍵設置點擊監聽器//如果內容長度<1就顯示"請輸入飲料名稱"
    btn_send.setOnClickListener    {
        if (ed_drink.length() < 1)
            Toast.makeText(this, "請輸入飲料名稱", Toast.LENGTH_SHORT).show()//浮動提示
        else {
            //宣告Bundle捆
            val b = Bundle()
            //取得 EditText 字串內容，把飲料名稱、甜度與冰塊資訊放入 Bundle
            b.putString("飲料", ed_drink.text.toString()) //放入字串("字串",id.內容文字.到字串)
            b.putString("甜度", radioGroup.findViewById<RadioButton>//放入字串("字串",id.按id查看<類型>
                    (radioGroup.checkedRadioButtonId).text.toString())   //(id.確認選中的按鍵id.)內容文字.到字串)
            b.putString("冰塊", radioGroup2.findViewById<RadioButton>
                    (radioGroup2.checkedRadioButtonId).text.toString())
            //用 Activity.RESULT_OK 標記執行狀態並記錄 Intent
            setResult(RESULT_OK, Intent().putExtras(b))
            finish() //結束
        }
    }
}
}