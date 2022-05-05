package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言 函数类型 作为返回类型
 */

fun main() {
    // r 是 show函数 的返回值
    val r = show("张三")
    // niming_showMethod 是 showMethod 函数的返回值，只不过这个返回值 是一个函数
    val niming_showMethod = showMethod("王五")
    // niming_showMethod = 匿名函数
    println(niming_showMethod.invoke("张三", 26))
}

private fun show(str: String): String {
    return "$str 学习kotlin 语言"
}

private fun showMethod(str: String): (String, Int) -> String {
    println("我是 showMethod 函数 str:$str")
    // 返回匿名函数
    return { name, age ->
        "我是匿名函数 $name 今年 $age 岁"
    }
}
