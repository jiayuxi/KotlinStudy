package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 语言的合并函数 - zip
 */

fun main() {
    val nameList = listOf("吕布", "赵云", "典韦", "关羽", "马超", "张飞")
    val ageList = listOf(22, 21, 23, 25, 26, 24)
    //Rxjava zip 合并操作符
    //kotlin 自带就有合并操作符
    // 原理：就是把第一个集合 和 第二个集合 合并起来，创建新的集合，并返回
    //      创建新的集合(元素，元素，元素) 元素Pair<T,R> ,T 代表集合第一个元素，R 代表集合第二个元素
    val zip = nameList.zip(ageList)
    println(zip)
    println(zip.toMap())
    println(zip.toMutableSet())
    println(zip.toMutableList())

    println()
    // 普通遍历
    zip.forEach {
        // it == Pair<String,Int>
        println("姓名是：${it.first},年龄：${it.second}")
    }
    println()
    // map 普通方式
    zip.toMap().forEach { k, v ->
        println("姓名是：$k,年龄：$v")
    }
    println()
    // map 解构的方式
    zip.toMap().forEach { (k, v) ->
        println("姓名是：$k,年龄：$v")
    }
}

