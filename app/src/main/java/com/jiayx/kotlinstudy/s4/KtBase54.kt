package com.jiayx.kotlinstudy.s4

import java.security.KeyStore

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 map 的遍历学习
 */

fun main() {
    val map: Map<String, Double> = mapOf(
        "kotlin" to (25.0), "java" to (52.0),
        Pair("C", 52.3), "C++" to 23.0
    )
    // 第一种遍历方式
    map.forEach {
        // it == 每一个元素  (K,V)
        // it 类型 Map.Entry<String,Double>
        println("key:${it.key}, value:${it.value}")
    }
    println()
    //第二种遍历方式
    map.forEach { key, value -> // 把默认的 it 给覆盖
        println("key:$key ,value:$value")
    }
    println()
    // 第三种方式
    map.forEach { (k, v) ->
        println("key:$k,value:$v")
    }
    println()
    // 第四种方式
    for(item:Map.Entry<String,Double> in map){
        println("key:${item.key} , value:${item.value}")
    }
}