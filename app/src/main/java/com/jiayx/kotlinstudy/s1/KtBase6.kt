package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/5/4
 kotlin 语言 range 表达式 区间范围
 */

fun main() {
    for(i in 1..10){ // 闭包区间 包含 10
        print("闭包区间 ：$i ")
    }
    println()
    for (i in 1 until 10){// 半闭包区间 不包含 10
        print("半闭包区间: $i ")
    }
    println()
    val list = arrayListOf(0,2,1,5,4,3,6)
    val list2 = arrayListOf(0,1,5,4,3,6)
    if(2 in list){// 是否包含 2
        println("包含2")
    }
    if(2 !in list2){// 不包含2
        println("不包含2")
    }
}
