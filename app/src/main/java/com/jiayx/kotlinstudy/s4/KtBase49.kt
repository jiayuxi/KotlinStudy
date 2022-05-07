package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 set 可变集合
 */

fun main() {
    val set: MutableSet<Int> = mutableSetOf(1, 2, 5, 4, 8, 6)
    set += 5
    set += 9
    set -= 2
    set -= 4
    set.removeIf { it == 5 }

    println(set)
}