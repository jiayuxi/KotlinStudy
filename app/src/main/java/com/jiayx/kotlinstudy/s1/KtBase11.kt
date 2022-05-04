package com.jiayx.kotlinstudy.s1

import java.sql.SQLOutput

/**
 *Created by yuxi_
on 2022/5/4
kotlin 语言 Nothing 类型特点
 */

fun main() {
    try {
      show(75)
    } catch (e:Exception){
        println("分数有问题")
    }
}

private fun show(number: Int) {
    when (number) {
        -1 -> TODO("没有这个分数")
        in 0..60 -> println("分数不及格")
        in 61..70 -> println("分数及格")
        in 71..90 -> println("分数良好")
        in 91..100 -> println("分数优秀")
    }
}
