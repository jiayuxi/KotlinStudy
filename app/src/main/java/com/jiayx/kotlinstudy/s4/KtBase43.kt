package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 list 集合的创建 于 读取
普通取值方式 索引
防止崩溃的取值方式  getOrElse,getOrNull
 */
fun main() {
    // list of  只读集合
    val list = listOf("张三", "李四", "王五", "赵柳")
    //普通方式的读取：index 下标
    println(list[0])
    println(list[1])
    println(list[2])
    println(list[3])
    //下标越界异常
//    println(list[4]) java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    // 防止崩溃的取值方式 getOrElse 如果未找到，给定默认返回值
    println(list.getOrElse(0) { "越界" })
    println(list.getOrElse(1) { "越界" })
    println(list.getOrElse(2) { "越界" })
    println(list.getOrElse(3) { "越界" })
    println(list.getOrElse(4) { "越界" })
    // 防止奔溃的取值方式，getOrNull 为取到值，返回 一个null
    // getOrNull + 空合并符 一起使用
    println(list.getOrNull(0))
    println(list.getOrNull(1))
    println(list.getOrNull(2))
    println(list.getOrNull(3))
    println(list.getOrNull(4))
}