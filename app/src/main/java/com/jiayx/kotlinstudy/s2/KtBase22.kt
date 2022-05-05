package com.jiayx.kotlinstudy.s2

import java.sql.SQLOutput

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言 匿名函数 与 具名函数
 */
fun main() {
    //匿名函数
    showInfo("张三", 25, '男', "学习kotlin语言") {
        println("显示结果：$it")
    }
    // 具名函数
    showInfo("李四", 20, '女', "学习C++ 语言", ::showResultImpl)
}

// 具名函数
private fun showResultImpl(str: String) {
    println("显示的结果：$str")
}

private inline fun showInfo(
    name: String,
    age: Int,
    sex: Char,
    study: String,
    showResult: (String) -> Unit
) {
    val str = "name:$name,age:$age,sex:$sex,study:$study"
    showResult(str)
}