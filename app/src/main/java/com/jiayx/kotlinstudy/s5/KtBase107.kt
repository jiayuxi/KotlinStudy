package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 语言变换函数-map 的学习
 */

fun main() {
    val listOf = listOf("一班", "二班", "三班")
    // 原理：就是把匿名函数 最后一行的返回值 加入一个新的集合，新集合的泛型为 R ,并且返回新集合
    val list1 = listOf.map {
        "【$it】"
    }
    println(list1)

    val list = listOf.map {
        "班级名：$it"
    }.map {
        "$it,文字的长度${it.length}"
    }.map {
        "【$it】"
    }.map {
        print(it)
    }
}