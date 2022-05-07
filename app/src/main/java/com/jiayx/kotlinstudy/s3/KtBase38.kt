package com.jiayx.kotlinstudy.s3

/**
 *Created by yuxi_
on 2022/5/6
kotlin 语言 run 内置函数
info.run 函数的特点：返回类型是根据匿名函数的最后一行变化而变化
info.run 函数里匿名函数里持有的 this 对象 == 调用者本身
 */

fun main() {
    val info = "kotlin is ok"
    // run 函数返回类型，是根据匿名函数的最后一行变化而变化
    val result = info.run { // 这个属于匿名函数 配合 run 使用
        // this == info  本身
        true
        ""
        '男'
        123456.3
    }
    println(result)
    // 具名函数 配合 run 函数
    // 具名函数 判断长度 isLong
    // info.run(具名函数)
    val result2 = info.run(::isLong)
        .run(::showText)
        .run(::maxText)
        .run(::println)
    // 匿名函数的调用
    info.run {
        this.length > 5
    }.run {
        if (this) "你的字符串合格" else "你的字符串不合格"
    }.run {
        "【$this】"
    }.run {
        println(this)
    }
    //let 具名函数的调用
    info.let(::isLong)
        .let(::showText)
        .let(::maxText)
        .let(::println)
    // let 内置函数 匿名函数的调用
    (info.length > 5).let {
        if (it) "你的字符串合格" else "你的字符串不合格"
    }.let {
        "【$it】"
    }.let {
        println(it)
    }
}

private fun isLong(str: String) /*: Boolean*/ = str.length > 5

private fun showText(flag: Boolean) /*: Boolean*/ = if (flag) "你的字符串合格" else "你的字符串不合格"

private fun maxText(getShow: String) /*: Boolean*/ = "【$getShow】"