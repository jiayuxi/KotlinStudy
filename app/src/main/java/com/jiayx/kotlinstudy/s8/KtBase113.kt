package com.jiayx.kotlinstudy.s8

/**
 *Created by yuxi_
on 2022/4/17
todo 注解 @JvmOverloads 与 kotlin
 函数重载
 */

//默认参数
@JvmOverloads // 对方法进行重载
fun show(name: String, age: Int = 20, sex: Char = '男') {
    println("name:$name,age:$age,sex:$sex")
}

fun main() {
    show("张三")
}