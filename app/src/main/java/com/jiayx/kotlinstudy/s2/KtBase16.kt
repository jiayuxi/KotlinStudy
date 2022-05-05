package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言的匿名函数的类型推断
 */

fun main() {
    // 匿名函数，类型推断为 String
    // 方法名 : 必须指定 参数类型 和 返回值类型
    // 方法名 = 类型推断返回类型
    val methodAction = { v1: Int, v2: Double, v3: Float ->
        "参数类型：v1:$v1 ,v2:$v2,v3:$v3"
    }// methodAction 函数 : (v1,v2,v3) -> String
    println(methodAction(99, 99.9, 52f))
    val method2 = {
        3653.5
    }// method2 函数 : () -> Unit
    println(method2())
    val method3 = { number: Int ->
        number
    }// method3 函数 : (Int) -> Int
    println(method3(9))

}