package com.jiayx.kotlinstudy.s8

/**
 *Created by yuxi_
on 2022/4/17
todo 注解 @JvmStatic 与 kotlin的关系
 */
class MyObject {
    companion object {
        @JvmField
        val TARGET = "人民公园"

        @JvmStatic
        fun show(str: String) = println("$str 要去$TARGET 玩")
    }
}

fun main() {

}
