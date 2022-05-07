package com.jiayx.kotlinstudy.s6

import com.jiayx.kotlinstudy.s3.randomItemValue as itemValue
import com.jiayx.kotlinstudy.s3.randomItemValuePrint as println

/**
 *Created by yuxi_
on 2022/4/15
todo kotlin 语言 重命名扩展学习
oldName as newName
oldName 通过 as 重命名为新的 newName
 */

fun main() {
    //未扩展文件,使用普通方法
    val listOf: List<String> = listOf("张三", "李四", "王五", "赵柳")
    val setOf: Set<Int> = setOf(12, 25, 23, 26)
    // 使用扩展文件
    println(listOf.itemValue())
    println(setOf.itemValue())
    println()
    listOf.println()
    setOf.println()
}