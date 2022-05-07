package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 可变 map 集合的操作
 */
/*
* 1、可变集合的操作 += [] put
* 2、getOrPut 有的情况
* 3、getOrPut 没有的情况
* */
fun main() {
    val map: Map<String, Double> = mapOf(
        "kotlin" to (25.0), "java" to (52.0),
        Pair("C", 52.3), "C++" to 23.0
    )
    // 1、可变集合的操作 += [] put
    var mutableMap: MutableMap<String, Double> = mutableMapOf(
        "kotlin" to (25.0), "java" to (52.0),
        Pair("C", 52.3), "C++" to 23.0
    )
    // 转化为 可变集合
    val mutableMap2 = map.toMutableMap()
    // 可变map 转化为 不可变 map
    val toMap = mutableMap.toMap()
    mutableMap += "kotlin2" to 23.2
    mutableMap += "kotlin3" to 24.0
    mutableMap -= "kotlin3"
    mutableMap["CCC"] = 254.2
    mutableMap.put("DDD", 999.2)
    // getOrPut 有的情况
    // 如果整个map 集合中 有 kotlin 的key元素,获取出来， 默认值 1254.2 数值失效
    println(mutableMap.getOrPut("kotlin") { 1254.2 })
    // getOrPut 没有的情况
    // 如果整个 map 集合中，没有 555 的 key 元素，我就帮你添加到map 集合中去，然后在从集合中获取
    println(mutableMap.getOrPut("555") { 1254.0 })

    mutableMap.forEach { (key, value) ->
        println("key:$key,value:$value")
    }
}