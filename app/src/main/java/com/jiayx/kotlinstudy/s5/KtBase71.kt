package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/12
todo 计算属性 与 防范竟太条件
 */

class KtBase71 {
    val number = 1

    /* 背后的代码
     * private int number = 1
     * public int getNumber() {
     * return this.number
     * }
    */
    //计算属性
    val number2: Int
        get() = (1..1000).shuffled().first()
    /* 背后的代码
    *  为什么没有看到number2属性定义
    *  答：因为属于 计算属性的功能，根本在 number2 属性里没有用到
    *   number2 属性，所以number2 属性失效
    *  public int getNumber2() {
    *   return (1..1000).shuffled().first() // 调用java 逻辑
    * }
    */

    var info: String? = null

    // 防范竟太条件 ，当你调用成员，这个成员 可能是 null,可能是空置，
    // 就必须采用防范静态条件，这个是 KT 的编程规范
    fun getShowInfo(): String {
        return info?.let {
            "最终info返回的结果：$it"
        } ?: "info 原来是 null,请检查代码"
    }
}

fun main() {
    // 背后隐含的代码
    // System.out.println(new KtBase71().getNumber())
    println(KtBase71().number)
    println()
    // System.out.println(new KtBase71().getNumber2())
    println(KtBase71().number2)
    println(KtBase71().getShowInfo())
}