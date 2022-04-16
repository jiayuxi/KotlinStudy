package com.jiayx.kotlinstudy.s5

import com.jiayx.kotlinstudy.s4.map

/**
 *Created by yuxi_
on 2022/4/15
todo kotlin 语言的 infix 关键字 （中缀表达式）
 */
// 自定义中缀表达式 + 扩展函数 一起使用
// 条件一：对第一个参数 T.goto 函数进行扩展
// 条件二：需要在(chat:O)里面，传递一个参数
//标有 infix 关键字的函数也可以使用中缀表示法（忽略该调用的点与圆括号）调用。
//中缀函数必须满足以下要求
// 1、它们必须是成员函数或扩展函数；
// 2、它们必须只有一个参数；
// 3、其参数不得接受可变数量的参数且不能有默认值
private infix fun <T, O> T.goto(chat: O) {
    // 省略一堆代码
    println("我们的中缀表达式 对第一个参数内容：$this")
    println("我们的中缀表示式 对第二个参数内容：$chat")
}

fun main() {
    mapOf("key" to 2)

    "kotlin" goto 123
    "kotlin".goto("学习中缀表达式")
}