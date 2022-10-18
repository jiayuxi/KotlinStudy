package com.jiayx.kotlinstudy.s10

import kotlin.random.Random

/**
 *Created by yuxi_
on 2022/8/1
 */

/**  if 表达式 （Java 中 if  是 语句，kotlin 里 是表达式）
 *   when 表达式
 *   for 循环
 *   while 循环
 *   break，continue
 *   return 返回
 *   标签(label)
 *   throw 表达式
 */
fun main() {
   if表达式()

}

private fun `if表达式`(){
    val a = 2
    if(a > 1) println("这个数是 真") else println("这个数是 假")
}

private fun `when表达式`(){
    when(5){
        in 1..5 -> println("1 到 5 之间的数")
        in 6 until 10 -> println("不包含 10")
        !in 11..20 -> println("不在 11 至 20 范围内")
        else -> println("其他的值")
    }
}

private fun `for循环`(){
    
}