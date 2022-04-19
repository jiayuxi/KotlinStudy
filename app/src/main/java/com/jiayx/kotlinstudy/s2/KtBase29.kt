package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/4/17
todo kotlin 语言 字符串的比较
在kotlin 里 用 == 检查两个字符串中的字符是否匹配，用 === 检查两个变量是否指向内存堆上同一个对象，
而在Java中，== 做引用比较，做结构比较时 用 equals 方法
 */
fun main() {
    //字符串常量池
    val str = "kotlin"
    val str2 = "kotlin"
    println(str == str2)
    println(str === str2)

    str.forEachIndexed { index, c ->
        println("index:[$index] , char:$c")
    }
}