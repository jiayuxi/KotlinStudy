package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言的先决条件函数
 */
fun main() {
    val value: String? = null
     val value2 = true
//    requireNotNull(value) //java.lang.IllegalArgumentException: Required value was null.
//    requireNotNull(value) { // java.lang.IllegalArgumentException: 你怎么回事，怎么能传递 一个 null
//        "你怎么回事，怎么能传递 一个 null"
//    }
    require(value2)//false java.lang.IllegalArgumentException: Failed requirement.
}