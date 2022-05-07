package com.jiayx.kotlinstudy.s7

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 语言 单例模式 - 线程安全的 懒汉式
 */
class SingletonObject03 {
    companion object {
        private var instance: SingletonObject03? = null
            get() {
                if (field == null) {
                    field = SingletonObject03()
                }
                return field
            }

        @Synchronized
        fun getInstanceAction() = instance!!
    }

    fun method(str: String) {
        println(str)
    }
}

fun main() {
    SingletonObject03.getInstanceAction().method("单例模式-线程安全的懒汉式")
}