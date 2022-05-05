package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言 安全调用操作符
kotlin 语言 中使用 带let 安全调用
kotlin 语言 空合并操作符
 */

fun main() {
    var name: String? = null
    name = "kotlin"
    name?.toString()// name 是可空类型，如果真的是null，? 后面的代买就不会执行，就不会引发空指针异常
    // 空合并 操作符 ， xxx ?: "原来你是 null" , 如果 xxx  等于 null 就会执行 ?: 后面的区域
    name?:"原来你是 null"
    // let + 空合并 操作符
    val result = name?.let {
        // it == name 本身
        // 如果你能够进入到这里，name 一定部位null
        it.ifBlank {
            "Default"
        }
    } ?: run { "name 你怎么回事，为什么是 空值" }
    println(result)
    val value = " "
    println("isBlack ： ${value.isBlank()}")
    println("isEmpty ： ${value.isEmpty()}")
    println()


}