package com.jiayx.kotlinstudy.s3

/**
 *Created by yuxi_
on 2022/5/6
kotlin 语言 apply 内置函数
info.apply 函数的特点：apply 函数始终返回 调用者本身，所以可以链式调用
apply 函数 匿名函数里持有的 this == 调用者本身
 */
fun main() {
    val info = "kotlin you hao"
    println(info.length)
    println(info[info.length - 1])
    println(info.toLowerCase())
    println()
    //  真正使用 apply 函数的规则如下：
    // info.apply 函数的特点：apply 函数始终返回 调用者本身，所以可以链式调用
    info.apply {
        println(length)
        println(this[length - 1])
        println(toLowerCase())
    }
}