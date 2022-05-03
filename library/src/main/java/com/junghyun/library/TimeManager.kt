package com.junghyun.library

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

public class TimeManager {

    protected var mTimeFormat: String = "yyyy-MM-dd hh:mm:ss"
    protected lateinit var mTimeZone: TimeZone
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

    fun getTime(timeFormat: String): String? {
        return timeGetter(timeFormat)
    }

    fun getTime(timeFormat: String, timeZoneCode: String): String? {
        return timeGetterUseTimeZone(timeFormat, timeZoneCode)
    }

    fun getTimeUseJustTimeZone(timeZoneCode: String): String? {
        return timeGetterUseTimeZone(mTimeFormat, timeZoneCode)
    }

    protected fun timeGetter(timeFormat: String): String?{

        try {
            val currentTime : Long = System.currentTimeMillis()
            val dataFormat = SimpleDateFormat(timeFormat)
            return dataFormat.format(currentTime)
        } catch (e: Exception) {
            return "지원하지 않는 시간포멧을 사용중입니다."
        }

    }

    protected fun timeGetterUseTimeZone(timeFormat: String, timeZoneCode: String): String?{

        try {

            val currentTime : Long = System.currentTimeMillis()
            val dataFormat = SimpleDateFormat(timeFormat)

            mTimeZone = TimeZone.getTimeZone(timeZoneCode)
            dataFormat.timeZone = mTimeZone

            return dataFormat.format(currentTime)

        } catch (e: Exception) {
            return "지원하지 않는 시간포멧을 사용중입니다."
        }

    }

}