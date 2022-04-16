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
}