package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/5/7
 kotlin 语言读取 map 值
 */
/*
* 方式一 ： [] 找不到会返回 null
* 方式二 ： getOrDefault
* 方式三 ： getOrElse
* 方式四 ： 和Java一样，会崩溃
*
* */
fun main() {
 val map: Map<String, Double> = mapOf("kotlin" to (25.0), "java" to (52.0))
 // 方式一
 println(map["kotlin"])// 背后对 [] 进行重载
 println(map["java"])
 println(map["xxx"]) // map 通过 key 找，如果找不到 返回 null ，不会崩溃
 // 方式二 getOrDefault
 println(map.getOrDefault("kotlin",-1))
 println(map.getOrDefault("java",-1))
 println(map.getOrDefault("xxx",-1))
 // 方式三 getOrElse
 println(map.getOrElse("kotlin"){-1})
 println(map.getOrElse("java"){-1})
 println(map.getOrElse("xxx"){-1})
 println()
 // 使用Java 的方式 会崩溃
 println(map.getValue("kotlin"))
}