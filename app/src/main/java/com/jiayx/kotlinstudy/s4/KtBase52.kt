package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言的 map 创建
 */

fun main() {
    // 不可变的 map 集合
    val map: Map<String, Double> = mapOf("kotlin" to (25.0), "java" to (52.0))
    val map2: Map<String, Double> = mapOf(Pair("kotlin", 24.0), Pair("java", 56.0))
    // 上面的这两种方式 是等价的
}