package com.jiayx.kotlinstudy.s3

import java.util.zip.InflaterOutputStream

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 also 内置函数
also 匿名函数 返回类型，永远返回 调用者本身
also 函数里的匿名函数里持有的 it == 调用者本身
 */

fun main() {
    val info = "kotlin"
    // 匿名函数 返回的 类型 永远是'调用者' 本身，可以进行链式调用
    info.also {

    }.also {

    }.also {

    }
}