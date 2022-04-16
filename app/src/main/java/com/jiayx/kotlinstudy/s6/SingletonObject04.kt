package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 语言 单例模式 线程安全的双重检索
 */

class SingletonObject04 {
    companion object {
        val instance: SingletonObject04 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonObject04()
        }
    }

    fun method(str: String) {
        println(str)
    }
}

fun main() {
    SingletonObject04.instance.method("单例模式-线程安全的双重检索")
}