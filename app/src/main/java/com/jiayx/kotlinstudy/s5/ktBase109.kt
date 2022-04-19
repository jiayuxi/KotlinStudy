package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 语言 过滤函数 - filter
 */

fun main() {
    val listOf = listOf(listOf("吕布", "赵云"), listOf("典韦", "关羽"), listOf("马超", "张飞"))

    val newList = listOf.map { it ->
        it.filter {
            true
        }
    }.map {
        println(it)
    }
    println()
    listOf.flatMap { it ->
        it.filter {
            true
        }
    }.map {
        print("$it  ")
    }
    println()
    println()
    listOf.flatMap { it ->
        it.filter { it -> // 可以细化 集合
            it.contains("赵")
        }
    }.map {
        print("$it  ")
    }
    println()
    // >>>>>>>>>>>>>>>>>>查找素数
    // 除了 1 和 它本身 不能被任何数整除的数
    // 取模等于 0 ，说明能被整除，如果没有一个是等于0 的，说明是素数
    println("开始查找素数")
    val list = listOf(7, 4, 3, 4, 8, 22, 18, 11)
    val newList1 = list.filter { number ->
        (2 until number).map {
            number % it
        }.none { it == 0 }
    }
    println("找到的素数：$newList1")
}