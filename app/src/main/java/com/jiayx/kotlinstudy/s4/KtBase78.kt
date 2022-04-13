package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/12
 by lazy kotlin 语言的惰性加载，懒加载，自动化加载
 */

class KtBase78 {
    // 普通方式加载（饿汉式）
//    val readData = readRoomData()
    // 使用 by lazy 惰性加载
    val readData2 by lazy { readRoomData() }
    private fun readRoomData():String{
        println("开始读取数据")
        println("正在加载数据")
        println("正在加载数据")
        println("正在加载数据")
        println("正在加载数据")
        println("正在加载数据")
        println("正在加载数据")
        println("结束加载数据")
        return "database data load success"
    }
}

fun main() {
    val ktBase78 = KtBase78()
    println("即将开始")
    Thread.sleep(5000)

    println("最终显示：${ktBase78.readData2}")
}
