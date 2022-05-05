package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言 == 与 === 的比较操作
 */
fun main() {
    // == 值 内容的比较，相当于 Java 的 equals
    // === 引用的比较

    val name1 = "Kotlin"
    val name2 = "Kotlin"
    val name3 = "www"
    // 小结：name1.equals(name2) 相当于 name1 == name2 都属于值内容的比较
    println(name1.equals(name2))
    println(name1 == name2)
    // 引用的比较
    println(name1 === name2)
    println(name1 === name3)

    // 引用的比较
    val name4 = "kotlin".capitalize()
    println(name1 == name4)
    println(name1 === name4)
    // String 字符串常量池
}
