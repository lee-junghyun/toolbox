package com.junghyun.toolbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.junghyun.library.TimeManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = TimeManager()

        Log.e(applicationContext.toString(), a.getTime().toString())
        Log.e(applicationContext.toString(), a.getTime("abcdefghijklmn").toString())
        Log.e(applicationContext.toString(), a.getTime("YY년 M월 d일 HH시").toString())
        Log.e(applicationContext.toString(), a.getTime("YY년 MM월 dd일 HH시", "Asia/Seoul").toString())
        Log.e(applicationContext.toString(), a.getTimeUseJustTimeZone("America/Toronto").toString())
    }
}