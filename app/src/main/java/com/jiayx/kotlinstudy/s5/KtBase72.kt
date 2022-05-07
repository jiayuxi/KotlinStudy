package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/12
todo 主构造函数定义属性
 */
class KtBase72(var name: String, val sex: Char, val age: Int) {
    fun show() {
        println(name)
        println(sex)
        println(age)
    }
}

fun main() {
    // 第一种传入属性
    KtBase72("kotlin",'男',20).show()
    // 第二种传入属性
    KtBase72(age = 26, name = "学习kotlin", sex = '女').show()
}

