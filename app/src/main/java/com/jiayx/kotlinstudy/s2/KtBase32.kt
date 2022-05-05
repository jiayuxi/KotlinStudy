package com.jiayx.kotlinstudy.s2

import java.sql.SQLOutput

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言的 replace 完成加密解密操作
 */

fun main() {
    val password = "ABCKDLEIHDNFOLEMSDHXU"
    println("未加密的值：$password")
    //完成加密
    val str = password.replace(Regex("[AKLHN]")) {
        when (it.value) {
            "A" -> "9"
            "K" -> "5"
            "L" -> "2"
            "H" -> "6"
            "N" -> "7"
            else -> it.value
        }
    }
    println("加密后的值：$str")
    // 解密
    val result = str.replace(Regex("[95267]")) {
        when (it.value) {
            "9" -> "A"
            "5" -> "K"
            "2" -> "L"
            "6" -> "H"
            "7" -> "N"
            else -> it.value
        }
    }
    println("解密后的值：$result")
}
