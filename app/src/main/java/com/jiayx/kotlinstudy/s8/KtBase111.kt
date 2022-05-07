@file:JvmName("Stu")// 就是在编译环节 修改我们类的名字，让Java端调用更简洁
package com.jiayx.kotlinstudy.s8

/**
 *Created by yuxi_
on 2022/4/17
todo 注解 @JvmName 与 kotlin
 */

fun getStudentValueInfo(str: String) = println(str)

fun main() {
    getStudentValueInfo("学习 kotlin @JvmName 注解")
}