package com.jiayx.kotlinstudy.s3

/**
 *Created by yuxi_
on 2022/5/6
kotlin 语言 let 内置函数
 list.let 函数返回的类型：是匿名函数的最后一行变化而变化
 let 函数里匿名函数持有的it 对象 == 调用者本身
 */

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    // list.let 函数返回的类型：是匿名函数的最后一行变化而变化
    // let 函数里匿名函数持有的it 对象 == 调用者本身
    val value = list.let {
        it.first() + it.first()
    }
}