package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言的 set 创建与获取
 */
//1、 set 定义 不允许有重复的值
//2、普通方式 elementAt 会越界崩溃
//3、elementAtOrElse , elementAtOrNull
fun main() {
    val set: Set<String> = setOf("战三", "赵柳", "王老七", "刘能")
    println(set)
    println(set.elementAt(0))
    println(set.elementAt(1))
    println(set.elementAt(2))
    println(set.elementAt(3))
//    println(set.elementAt(4))// 越界崩溃
    // elementAtOrNull 元素下标不存在 返回 一个 null，不会产生崩溃
    println(set.elementAtOrNull(0))
    println(set.elementAtOrNull(1))
    println(set.elementAtOrNull(2))
    println(set.elementAtOrNull(3))
    println(set.elementAtOrNull(4))
    // elementAtOrElse 元素下标 不存在 ，返回一个默认值
    println(set.elementAtOrElse(1){"越界"})
    println(set.elementAtOrElse(5) { "越界" })
}