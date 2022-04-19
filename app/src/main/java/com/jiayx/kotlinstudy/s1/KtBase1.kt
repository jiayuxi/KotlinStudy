package com.jiayx.kotlinstudy.s1

import android.icu.text.RelativeDateTimeFormatter
import javax.xml.transform.Source

/**
 *Created by yuxi_
on 2022/4/18
todo kotlin 语言 range 使用空间 （in）
使用 in 运算符来检测某个数字是否在指定区间
 */

fun main() {
    val x = 10
    val y = 9
    // x 是否在 1..y+1 区间
    if (x in 1..y + 1) { //
        println("fits in range")
    }
    // 检测某个数字是否在指定区间外
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    println("indices:${list.indices}")
    println("list.size: ${list.size}")
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
    // intRange区间迭代
    for (i in 1..3) {// 等同于 1 <= i && i <= 3
        println("IntRage区间迭代 i : $i")
    }
    // longRage区间迭代
    for (i in 1L..3L) {
        println("LongRage区间迭代：i : $i")
    }
    // charRage 区间迭代
    for (i in 'a'..'c') {
        println("charRage区间迭代 i : $i")
    }
    // 要反向迭代数字，请使用 downTo 函数而不是 ..
    for (i in 3L downTo 1L) {
        println("反向迭代：$i")
    }
    for (i in 'c' downTo 'a') {
        println("charRage 反向迭代 i : $i")
    }
    //正向迭代-也可以通过任意步长（不一定为 1 ）迭代数字。 这是通过 step 函数完成的
    // 开始第一个参数i之后，后续的元素是前一个元素加上 step
    // 作为下一开始的个参数，并检测 参数是否在 1..9 区间
    for (i in 1..9 step 2) {
        println("in step i : $i")
    }
    // 反向迭代 - 也可以通过任意步长（不一定为 1 ）迭代数字。 这是通过 step 函数完成的
    // 开始第一个参数i之后，后续的元素是前一个元素减上 step
    // 作为下一个开始的参数，并检测是否 在 8 downTo 1 之间
    for (i in 9 downTo 0 step 3) {
        println("downTo step i : $i")
    }
    //要迭代不包含其结束元素的数字区间，请使用 until 函数：
    /*
    * for(var4 = 4; i < var4; ++i)
    * */
    for (i in 1 until 4) {
        println("不包含其结束元素的数字区间 until : $i")
    }
    // 类区间
    val versionRage = Version(1, 10)..Version(1, 30)
    println(Version(0, 9) in versionRage)
    println(Version(1, 20) in versionRage)

    // 数列
    //数列具有三个基本属性：first 元素、last 元素和一个非零的 step。
    //首个元素为 first，后续元素是前一个元素加上一个 step。
    //以确定的步长在数列上进行迭代等效于 Java/JavaScript 中基于索引的 for 循环。
    // for (int i = first; i <= last; i += step) {
    // ……
    //}
    //数列的 last 元素是这样计算的：
    //对于正步长：不大于结束值且满足 (last - first) % step == 0 的最大值。
    //对于负步长：不小于结束值且满足 (last - first) % step == 0 的最小值。

    //如果是区间对象，我们可以打印区间对象的四种函数结果
    //可以得到，区间的开始元素first，结束元素last，区间最后元素endInclusive，区间循环开始元素start，步长step
    // 1、默认情况
    var range1: IntRange = 1..10
    println("first :${range1.first}")
    println("last :${range1.last}")
    println("endInclusive :${range1.endInclusive}")
    println("start :${range1.start}")
    println("step :${range1.step}")
    println()
    //2、正序如果我们针对step 做一些调整，那么last 参数就会发生变化了。同时 endInclusive 和start 将无法使用。
    var range2 = 1..10 step (2)
    println("first :${range2.first}")
    println("last :${range2.last}")
//    println("endInclusive :${range2.endInclusive}")
//    println("start :${range2.start}")
    println("step :${range2.step}")
    println()
    // 3、倒叙
    var ragne3 = 10 downTo 1 step (2)
    println("first :${ragne3.first}")
    println("last :${ragne3.last}")
//    println("endInclusive :${range2.endInclusive}")
//    println("start :${range2.start}")
    println("step :${ragne3.step}")
    println()
}

//为类创建一个区间

class Version(private val major: Int, private val minor: Int) : Comparable<Version> {
    override fun compareTo(other: Version): Int {
        if (this.major != other.major) {
            return this.major - other.major
        }
        return this.minor - other.minor
    }
}