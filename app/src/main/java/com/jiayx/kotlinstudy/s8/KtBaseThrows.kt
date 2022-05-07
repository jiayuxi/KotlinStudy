package com.jiayx.kotlinstudy.s8

import java.io.IOException
import kotlin.jvm.Throws

/**
 *Created by yuxi_
on 2022/4/18
todo kotlin 语言 throw 抛出异常 Java中捕获
 */

fun main() {
    try {
        KtBaseThrow().extendException()
    } catch (e: IOException) {
        println("Begone ,foul beast")
    }
    try {
        acceptApology()
    } catch (e: Exception) {
        println("Caught:${e.message}")
    }
}
// 抛出异常
@Throws(IOException::class)
fun acceptApology() {
    throw IOException("IO 异常")
}