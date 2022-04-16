package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/16
 todo kotlin 语言 单例模式 枚举
 */

enum class SingletonObject06 {
    INSTANCE;

    fun method(str:String){
        println(str)
    }
}

fun main() {
    SingletonObject06.INSTANCE.method("单例模式-枚举")
}