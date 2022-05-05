package com.jiayx.kotlinstudy.s2

import kotlin.math.roundToInt

/**
 *Created by yuxi_
on 2022/5/5
 kotlin 语言中数字类型的安全转换函数
 Kotlin 语言中 Double 转 Int 与类型格式化
 */
fun main() {
    val number:Int = "666".toInt()
    println(number)
//    字符传中放入了 Double 类型，无法转换成 Int ，会崩溃
//    val number2 = "666.6".toInt()
//    println(number2)
    // 解决崩溃的问题
    val number3:Int? = "666.6".toIntOrNull()
    println(number3)

    println(64.42365.toInt())//64 四舍五入
    println(64.42365.roundToInt())//64 四舍五入
    println(64.82365.roundToInt())//65 四舍五入
    // 保留小数点后面的三位
    val format:String = "%.3f".format(64.82365)
    println(format)
}