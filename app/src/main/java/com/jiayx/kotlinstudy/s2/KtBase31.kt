package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言的 substring
kotlin 语言的 split 分隔符操作
 */

fun main() {
    val info = "kotlin is success result"
    val index = info.indexOf('i')
    println(info.substring(0, index))
    println(info.substring(0 until index))

    val jsonStr = "kotlin,java,c++,c#"
    // list 自动推断成 List<String>
    val list = jsonStr.split(",")
    println(list)
    // c++ 中有结构，kt 也有结构
    val (v1, v2, v3, v4) = list
    println("v1:$v1,v2:$v2,v3:$v3:v4:$v4")
}