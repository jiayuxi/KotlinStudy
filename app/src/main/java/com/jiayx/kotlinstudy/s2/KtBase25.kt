package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
 kotlin 语言 非空断言操作符的特点
 kotlin 语言 使用 if 判断null 值的情况
 */

fun main() {
    var name : String? = null
    name = "java"

    val value = name!!.capitalize() // !! 断言 不管 name 是不是为null，都执行，这个和Java一样
    // 结论：规矩：如果百分百保证 name 是有值的，才能使用断言

    if(name == null){
        println("name  为null")
    } else {
        println("值：$name")
    }
}