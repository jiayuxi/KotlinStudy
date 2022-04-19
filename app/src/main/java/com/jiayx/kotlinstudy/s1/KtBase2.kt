package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/4/18
 */

fun main() {
    val list = listOf("张三", "李四", "王五")
    if ("张三" in list) {
        println("张三存在于集合中")
    }
    if ("赵柳" !in list) {
        println("赵柳 不存在于集合中")
    }
    val myTurtle = Turtle()
   val withFunction = with(myTurtle) { // 画一个 100 像素的正方形
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
       "with调用"
    }
    println(withFunction)
}

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}