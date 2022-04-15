package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/15
todo kotlin 语言 泛型函数的扩展
 */
// Sting 字符串的输入
fun <T> T.showContentInfo() = println(
    if (this is String) "你是字符串，字符串的长度为：${this.length}" else "你不是字符串，你的内容为：$this")

// 时间输出
fun <I> I.showTime() = println("你当前调用的时间：${System.currentTimeMillis()}, 你的内容：$this")

// 显示调用者的类型

fun <INPUTTYPE> INPUTTYPE.showTypeAction(){
    when(this){
       is String -> println("你是String 类型")
       is Float -> println("你是 Float 类型")
       is Double -> println("你是 Double 类型")
       is Boolean -> println("你是Boolean 类型")
       is Int -> println("你是Int 类型")
       is Char -> println("你是 Char 类型")
        is Unit -> println("原来你是函数类型")
       else -> println("位置类型")
    }
}

fun main() {
    "kotlin 语言学习".showContentInfo()
    "kotlin 语言学习".showTime()
    "kotlin 语言学习".showTypeAction()
}