package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/5/4
 kotlin 语言的 String 字符串 模板
 */

fun main() {
    val str = "人民公园"
    val time = 6
    println("小明于下午$time 点去 $str 游玩")
    // kotlin 语言 if 是表达式，更灵活，java 中 if 是语句，有局限性
    val isLogin = true
    println("result: ${if(isLogin) "登录成功" else "登录失败"}")
}