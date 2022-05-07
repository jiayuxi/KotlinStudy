package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 可变集合的学习
 */
// 可变集合
// 可变集合转化为不可变集合
// 不可变集合转化为可变集合
// distinct 过滤重复元素
fun main() {
    //可变集合
    val mutableList = mutableListOf("张三", "李四", "王五", "赵柳")
    //可变集合，可以完成的可变操作
    mutableList.add("李逵")
    mutableList.remove("王五")
    mutableList.removeIf { it == "张三" }
    println(mutableList)
    // 不可变集合 to 为可变集合
    val list = listOf(1, 2, 4, 5, 8, 7,2)
    val mutableList2 = list.toMutableList()
    mutableList2.add(0, 9)
    mutableList2.remove(4)
    println(mutableList2)
    // 可变集合 to 不可变集合
    val mutableList3 = mutableListOf(2, 5, 4, 8, 6, 3, 4)
    val list2 = mutableList3.toList()
    /*list2.add
    list2.remove*/
    println(list2)
    // 过滤重复元素
    val distinct = list.distinct()
    println(distinct)
}