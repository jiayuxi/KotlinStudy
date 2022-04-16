package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 单例模式 饿汉式
 */
object SingletonObject01 {
    fun method(str: String) {
        println(str)
    }
}

fun main() {
   SingletonObject01.method("单例模式-饿汉式")
}