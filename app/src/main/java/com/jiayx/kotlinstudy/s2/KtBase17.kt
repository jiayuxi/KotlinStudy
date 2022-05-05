package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言的 lambda 学习
 */
fun main() {
    // 匿名函数 = lambda 表达式
    val method = { number1: Int, number2: Int ->
        "两数相加的和：${number1.plus(number2)}"
    }// method 函数:(Int,Int) -> String
    println(method(22, 24))
    // 匿名函数  入参 Int, 返回 Any 类型
    // lambda  表达式的参数 Int , lambda 返回的结果类型也是 Any 类型
    val weekResult = { number: Int ->
        when (number) {
            1 -> "星期一"
            2 -> "星期二"
            else -> -1
        }
    }// weekResult 函数 : (Int) -> Any
    println(weekResult(2))
    // 结论：匿名函数属于lambda
}
