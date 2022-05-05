package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
 kotlin 语言的函数参数的学习
 */
fun main() {

    // 第一步 函数声明  第二步 对函数声明的实现
    val methodAction:(Int,Int,Int)->String = { number1,number2,number3 ->
        "kotlin 参数1：$number1,参数2：$number2,参数3：$number3"
    }
    println(methodAction(12,25,24))
}

/*
fun methodAction(number1:Int,number2:Int,number3:Int):String {
    return  "kotlin 参数1：$number1,参数2：$number2,参数3：$number3"
}*/
