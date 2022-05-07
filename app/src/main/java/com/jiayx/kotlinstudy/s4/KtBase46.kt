package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 list 的遍历学习
 */

fun main() {
    val list = mutableListOf(1, 2, 5, 8, 7, 6, 2)
    println("过滤：${list.distinct()}")
    // 第一种 遍历方式
    for (i in list) {
        print("元素：$i ")
    }
    println()
    // 第二种 遍历方式
    list.forEach {
        print("元素：$it ")
    }
    println()
    // 第三种 下标遍历方式
    list.forEachIndexed { index, item ->
        print("下标：$index , 值：$item")
    }
}