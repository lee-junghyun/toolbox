package com.junghyun.library

import java.text.SimpleDateFormat

public class TimeManager {

    var mTimeFormat: String = "yyyy-MM-dd hh:mm:ss"
//    var mCountryCode: Int = 0
//
//    constructor(timeFormat: String) {
//
//        this.mTimeFormat = timeFormat
//
//    }
//
//    constructor(timeFormat: String, countryCode: Int) {
//
//        this.mTimeFormat = timeFormat
//        this.mCountryCode = countryCode
//
//    }

    fun getTime(): String?{
        return timeGetter(mTimeFormat)
    }

    fun getTime(timeFormat: String, countryCode: Int){

    }

    fun getTime(countryCode: Int){


    }

    fun timeGetter(timeFormat: String): String? {
        val currentTime : Long = System.currentTimeMillis()
        val dataFormat = SimpleDateFormat(timeFormat)
        return dataFormat.format(currentTime)
    }



}