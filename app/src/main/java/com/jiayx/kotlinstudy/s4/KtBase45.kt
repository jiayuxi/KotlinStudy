package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 mutator 函数的学习
 */
// mutator +=,-= 操作
// mutator removeIf 操作
fun main() {
    val list = mutableListOf("kotlin", "java", "c++", "c#")
    list += "Android"
    list -= "c++"
    println(list)
//    val list2 = list.removeIf { true } // 自动遍历整个集合，一个一个删除
    val list2 = list.removeIf{it.contains("j")}//过滤所有元素，只要是 带 j 元素的都是 true
    println(list)
}