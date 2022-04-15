package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/15
todo kotlin 语言扩展函数
 */
data class KtBase98(val name: String, val age: Int, val sex: Char)

// 对类型扩展
fun KtBase98.show() {
    println("name:${this.name},age:${this.age},sex:${this.sex}")
}

fun KtBase98.getInfo() = "name:${this.name},age:${this.age},sex:${this.sex}"
fun main() {
    method01()
    KtBase98("王五", 20, '男').show()
    println(KtBase98("赵柳", 22, '女').getInfo())
}

// 如果一个类定义有一个成员函数与一个扩展函数，而这两个函数又有相同的接收者类型、
// 相同的名字，并且都适用给定的参数，这种情况总是取成员函数
//扩展函数重载同样名字但不同签名成员函数也完全可以
fun method01() {
    class Example {
        fun printFunctionType() {
            println("Class method")
        }
    }

    fun Example.printFunctionType() {
        println("Extension function")
    }

    fun Example.printFunctionType(i: Int) {
        println("Extension function : ${this.javaClass.name}")
    }
    // 输出 Class method
    Example().printFunctionType()
    Example().printFunctionType(1)
}