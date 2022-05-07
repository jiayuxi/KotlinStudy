package com.jiayx.kotlinstudy.s4

import java.lang.invoke.CallSite

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 结构语法过滤元素
 */

fun main() {
    val list = listOf("kotlin", "java", "android")
    // val 修饰结构语法，不能修改里面的值，只能读取
    val (value1, value2, value3) = list
    println("value1:$value1,value2:$value2,value3:$value3")
    // var 修饰结构语法，可以修改里面的值，可读可写
    var(v1,v2,v3) = list
    v1 = "学习 kotlin"
    println("v1:$v1,v2:$v2,v3:$v3")
    // 用 _ 内部可以不接收赋值，节约一点性能
    val(n1,_,n3) = list
    println("n1:$n1 ,n3:$n3 ")
}