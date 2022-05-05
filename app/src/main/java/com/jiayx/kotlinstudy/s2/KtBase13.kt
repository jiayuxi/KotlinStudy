package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言的匿名函数
 */

fun main() {
  val count = "kotlin".count()
  println(count)
  val len:Int = "kotlin".count {
     //匿名函数 it 等价于 k o t l i n Char字符
      it == 'k' // 返回 k的个数
  }
  println(len)
}