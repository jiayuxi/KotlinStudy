package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 的集合转换 与 快捷函数 学习
 */

fun main() {
    // 可变集合
    val list = mutableListOf("kotlin", "java", "kotlin", "android")
    // list 转 set 去重
    val set = list.toSet()
    println(set)
    // list 转 set 转 list 去重
    val list2 = list.toSet().toMutableList()
    val list3 = list.toSet().toList()
    println(list2)
    println(list3)
    // 快捷函数去重 distinct
    val distinct = list.distinct()
    println(distinct)
}