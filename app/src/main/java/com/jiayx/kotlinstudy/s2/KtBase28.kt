package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/4/17
todo kotlin 语言 函数类型作为返回类型
 */
fun main() {
    val configDiscountWord = configDiscountWord()
    println(configDiscountWord("kotlin"))
}

private fun configDiscountWord(): (String) -> String {
    return { name ->
        "函数类型作为返回类型：$name"
    }
}