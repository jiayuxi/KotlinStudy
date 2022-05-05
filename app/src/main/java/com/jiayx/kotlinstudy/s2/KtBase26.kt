package com.jiayx.kotlinstudy.s2

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语法中 异常处理 与自定义异常处理
 */

fun main() {
    try {
        val info: String? = null
        checkException(info)
        println(info!!.length)
    } catch (e: Exception) {
        println("error:$e")
    }
}

private fun checkException(str: String?) {
    str ?: throw CustomException()
}

class CustomException : IllegalArgumentException("你的代码太不严谨了")
