package com.jiayx.kotlinstudy.s4

import java.io.File

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 数组类型的学习
 */
/*
* kotlin 中的各种数组类型，虽然是引用类型，背后可以编译成 Java的基本数据类型
* IntArray       intArrayOf
* DoubleArray    doubleArrayOf
* FloatArray     floatArrayOf
* BooleanArray   booleanArrayOf
* CharArray      charArrayOf
* LongArray      longArrayOf
* ShorArray      shorArrayOf
* ByteArray      byteArrayOf
* Array          arrayOf     对象数组
*
* */
fun main() {
    // intArray 常规操作的越界崩溃
    val intArray: IntArray = intArrayOf(1, 2, 4, 5, 8, 4)
    println(intArray[0])
    println(intArray[1])
    println(intArray[2])
    println(intArray[3])
//    println(intArray[6]) 下标越界
    println()
// elementAtOrNull , elementAtOrElse
    println(intArray.elementAtOrElse(0) { -1 })
    println(intArray.elementAtOrElse(8) { -1 })
    println()
    println(intArray.elementAtOrNull(0))
    println(intArray.elementAtOrNull(200))
    // elementAtOrNull + 空合并操作符
    println(intArray.elementAtOrNull(200) ?: "你越界了")
    // list 转化为 数组
    // 数组转化 list
    val toList = intArray.toList()
    intArray.forEach {
        print("$it ")
    }
    println()
    println(toList)
    // list 转化为 数组
    val charArray = listOf('A', 'V', 'V').toCharArray()
    println(charArray)
// arrayOf 对象数组
    val array = arrayOf(File("AAA"),File("ccc"))
}