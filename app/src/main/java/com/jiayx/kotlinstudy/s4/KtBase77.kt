package com.jiayx.kotlinstudy.s4

import kotlin.String as String

/**
 *Created by yuxi_
on 2022/4/12
lateinit var 懒加载，手动加载
 */
class KtBase77 {
    lateinit var value: String
    fun getShow() {
        if (::value.isInitialized) {// 判断是否初始化赋值
            println("初始化赋值成功：$value")
        } else {
            println("你还没有进行 初始化赋值")
        }
    }
}

fun main() {
    val ktBase77 = KtBase77()
//    ktBase77.value = "懒加载赋值"
    ktBase77.getShow()
}