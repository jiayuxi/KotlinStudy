package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/12
todo kotlin 运算符的重载
 */

data class AddClass(var number1: Int, var number2: Int) {
//    operator fun plus(p1: AddClass): Int {
//        return (number1 + p1.number1) + (number2 + p1.number2)
//    }

    operator fun plus(p1: AddClass): AddClass =
        AddClass(number1 + p1.number1, number2 + p1.number2)
}

fun main() {
    val number1 = 1
    val number2 = 2
    println(number1.plus(number2))
    // var2 = (new AddClass(1, 1)).plus(new AddClass(2, 2));
    println(AddClass(1, 1) + AddClass(2, 2))
}