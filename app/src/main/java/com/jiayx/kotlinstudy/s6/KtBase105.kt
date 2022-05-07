package com.jiayx.kotlinstudy.s6

import java.io.File

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 语言 apply 函数详解
 */
// private  私有化
// inline 应为我们的函数是高阶函数，所以使用内联函数，对其进行优化，提高性能
// fun<I> 声明一个泛型
// I.myApply 让所有类型都可以对 I.myApply 进行扩展
// I.() -> Unit 让我们的匿名函数里 持有隐式的 this 对象，在 lambda 里不需要返回值，应为永远返回 I 本身
// lambda() 默认就有this
// 返回 this 的目的 可以进行链式调用
private inline fun <I> I.myApply(lambda: I.() -> Unit): I {
    lambda()
    return this
}

fun main() {
    File("D:\\file.txt").myApply {
        setReadable(true)
        setWritable(true)
    }
    // 分解函数
    //1、定义扩展函数
    fun File.ext(): Unit {
        setReadable(true)
    }
    //2、给 block变量赋值
    var block = File::ext
    //传入 apply 函数
    File("D:\\file.txt").apply { block }
}