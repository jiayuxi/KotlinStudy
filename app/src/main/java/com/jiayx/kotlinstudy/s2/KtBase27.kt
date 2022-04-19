package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/4/17
todo kotlin 语言类型推断
 */

fun main() {
    val blessingFunction: (String, Int) -> String = { name, age ->
        "name$name ,age:$age"
    }
    val blessingFunction1 = { name: String, age: Int ->
        "name$name ,age:$age"
    }
    println(blessingFunction1("张三", 20))
    println(blessingFunction("李四", 22))
}