package com.jiayx.kotlinstudy.s4

import android.content.PeriodicSync
import java.sql.SQLOutput

/**
 *Created by yuxi_
on 2022/4/12
TODO kotlin 语言的继承与重载的 open 关键字
 */
// KT 所有的类都是 final 修饰，不能被继承，和 Java 相反
// open: 关键字 移除final 修饰
open class Person(private val name: String) {
    private fun show() = "父类的名字是：$name"

    // KT 所有的函数，都是 final 修饰，不能被重写，和 Java 相反
    open fun myPrintln() = println(show())
}

class Student(private val subName: String) : Person(subName) {
    private fun showName() = "子类的姓名 是：$subName"
    override fun myPrintln() = println(showName())
}

fun main() {
    val person:Person = Student("张三")
    person.myPrintln()
}
