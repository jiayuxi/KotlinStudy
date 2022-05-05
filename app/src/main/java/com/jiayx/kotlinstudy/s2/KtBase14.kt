package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言的函数类型&隐式返回
 */
fun main() {
    // 第一步 函数 输入输出声明
    // val 修饰符 ，methodAction 函数名 ，() 函数输入 ，String 函数输出
    val methodAction: () -> String
    // 第二步 对上面的函数实现
    methodAction = {
        val input = 9999
        "$input kotlin"
    }

    // 第三步 函数的调用
    println(methodAction())
}
// 第一步 ，第二步 相等于 如下函数
//fun methodAction():String{
//    return "kotlin"
//}