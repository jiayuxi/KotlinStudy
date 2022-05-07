package com.jiayx.kotlinstudy.s5

import java.io.File

/**
 *Created by yuxi_
on 2022/4/12
todo kotlin 语言的类型转化学习
 */
open class Person2(private val name: String) {
    fun show1() = "父类的名字是：$name"

    // KT 所有的函数，都是 final 修饰，不能被重写，和 Java 相反
    open fun myPrintln() = println(show1())
}

class Student2(private val subName: String) : Person2(subName) {
    fun showName2() = "子类的姓名 是：$subName"
    override fun myPrintln() = println(showName2())
}

fun main() {
    val person: Person2 = Student2("李元霸")
    person.myPrintln()
    println(person is Person2)
    println(person is Student2)
    println(person is File)
    // is  +  as 配合使用
    if (person is Person2) {
        (person as Student2).myPrintln()
        // 只能转换类型，会根据上面 as 转成的类型，自动明白，你现在的类型，就是上面的类型
        person.showName2()
    }
    if (person is Person2) {
        println((person as Person2).show1())
    }
}
