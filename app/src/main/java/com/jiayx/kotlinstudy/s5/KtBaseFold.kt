package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/18
todo kotlin 语言 fold 合并函数
 */

fun main() {
    // folder
    val list = listOf(1, 2, 3, 4)
    val foldValue = list.fold(0) { accumulator, number ->
        println("accumulator:$accumulator")
        accumulator + (number * 3)
    }
    println(foldValue)
}
