package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
 kotlin 语言的 字符串 遍历
 */
fun main() {
    val password = "ABCKDLEIHDNFOLEMSDHXU"
    password.forEach {
        // it == 每一个字符 'A','B'等
        println("value：$it")
    }
}