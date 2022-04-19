package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/18
todo kotlin 序列，序列查找素数
 */
fun Int.isPrime(): Boolean {
    return (2 until this).map {
        this % it
    }.none {
        it == 0
    }
}

fun main() {
    // 生产素数 ，从 0 - 5000中查找
    val toList = (0..5000).toList().filter { it.isPrime() }.take(1000)
    println(toList.size)
    // 生产以前个素数
    val newList: Sequence<Int> = generateSequence(2) { value ->
        value + 1
    }.filter { it.isPrime() }.take(1000)

    println(newList.toList().size)

}