package com.jiayx.kotlinstudy.s9

import android.app.AlarmManager
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *Created by yuxi_
on 2022/5/13
 kotlin 语言 扩展函数的调用
 */
// 内联的扩展函数
inline fun <reified T> Context.systemService() = getSystemService(T::class.java)

class Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val systemService: AlarmManager = this.systemService()
    }
}