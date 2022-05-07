package com.jiayx.kotlinstudy.s7

/**
 *Created by yuxi_
on 2022/4/16
todo 单例模式 懒汉式
 */

class SingletonObject02 {
    companion object {
        private var instance: SingletonObject02? = null
            get() {
                if (field == null) {
                    field = SingletonObject02()
                }
                return field
            }

        fun getInstanceAction() = instance!!
    }

    fun method(str:String){
        println(str)
    }
}

fun main() {
    SingletonObject02.getInstanceAction().method("单例模式-懒汉式")
}

