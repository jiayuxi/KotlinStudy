package com.jiayx.kotlinstudy.s3

/**
 *Created by yuxi_
on 2022/5/7
kotlin  语言的 with 内置函数
with 返回值类型 是根据匿名函数的最后一行变化而变化
with 函数匿名函数里 持有 的 this 对象  == 调用者
 */

fun main() {
    val str = "kotlin with"
    // 返回类型 是根据匿名函数的最后一行变换而变化
    val result = with(str) {
        // this == str 本身
        true
    }
    println(result)
    // with 具名函数的调用
    val r = with(str, ::isLong)
    val r2 = with(r, ::showText)
    val r3 = with(r2, ::maxText)
    with(r3, ::println)
    // with  匿名函数的调用
    with(with(with(with(str) { length > 5 }) {
        if (this) "你的字符串合格" else "你的字符串不合格"
    }) {
        "【$this】"
    }) {
        println(this)
    }
}

private fun isLong(str: String) /*: Boolean*/ = str.length > 5

private fun showText(flag: Boolean) /*: Boolean*/ = if (flag) "你的字符串合格" else "你的字符串不合格"

private fun maxText(getShow: String) /*: Boolean*/ = "【$getShow】"