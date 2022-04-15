package com.jiayx.kotlinstudy.s5

import com.jiayx.kotlinstudy.s3.randomItemValue
import com.jiayx.kotlinstudy.s3.randomItemValuePrint

/**
 *Created by yuxi_
on 2022/4/15
todo kotlin 语言定义 扩展文件
 */

fun main() {
    //未扩展文件,使用普通方法
    val listOf: List<String> = listOf("张三", "李四", "王五", "赵柳")
    val setOf: Set<Int> = setOf(12, 25, 23, 26)
    println(listOf.shuffled().first())
    println(setOf.shuffled().first())
    println()
    // 使用扩展文件
    println(listOf.randomItemValue())
    println(setOf.randomItemValue())
    println()
    listOf.randomItemValuePrint()
    setOf.randomItemValuePrint()
}