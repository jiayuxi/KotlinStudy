package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/5/4
kotlin 语言 when 表达式
 */

fun main() {
    val week = 5
    // Any 任何类型
    val info:Any = when (week) {
        1 -> "星期一"
        2 -> "星期二"
        3 -> "星期三"
        4 -> "星期四"
        5 -> "星期五"
        6 -> "星期六"
        7 -> "星期日"
        else -> {
            // 返回 Unit 没有任何返回类型， 代替 Java 中的 void
            println("不匹配任何星期,忽略")
        }
    }

    println(info)
}
