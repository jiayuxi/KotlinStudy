package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 语言变换函数 -flatmap
 */
//map{返回类型：T String Int Boolean Char ... 是把每一个元素加入新的集合，最后返回新集合List<T>}
//flatMap {返回类型：每一个元素T 集合1，集合2，集合3 ... 把每一个元素(集合)加入到新的集合，
// 最后返回新集合List<List<T>>,最终内部会处理成List<String>}
fun main() {
    val listOf = listOf("吕布", "赵云", "典韦", "关羽", "马超", "张飞")
    // 返回集合
    val newList: List<List<String>> = listOf.flatMap {
        listOf<List<String>>(listOf("$it 学习kotlin", "$it 学习flatMap"))
    }
    // 返回集合
    val newList1 = listOf.map {
        "$it 学习kotlin"
    }.map {
        "$it 学习flatMap"
    } .flatMap {
        listOf(it)
    }
    println(newList)
    println()
    println(newList1)
}