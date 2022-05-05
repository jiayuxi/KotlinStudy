package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言的可控性特点
 */

fun main() {
    // todo 第一种情况：默认是不可空类型，不能随意给 null
    val name = "kotlin"
    // 提示： 不能是非空类型的String值
    // name = null
    println(name)
    // TODO 第二种情况：声明时 指定为可空类型
    var name2: String?
    name2 = null
    println(name2)
}