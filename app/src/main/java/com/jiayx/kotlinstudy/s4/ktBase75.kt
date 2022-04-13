package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/12
todo kotlin 语言 初始化块学习
     临时类型只能在 init 代码块中调用
     init 代码块 学习 require
 */
class KtBase75(userName: String, userAge: Int, sex: Char) {
    // 这个不是Java的 static{}
    // 相当于Java 的 {} 代码块
    // 初始化 init 代码块
    init {
        println("调用主构造函数  name:$userName,age:$userAge,sex:$sex")
        /*
        * 如果第一参数 为 false ,就会调用第二参数 lambda
        * public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit {}
        */
        require(userName.isNotBlank()){
            println("你的名字 空空如也，抛出异常")
        }
        require(userAge > 0){
            println("你的年龄userAge:$userAge 不符合，抛出异常")
        }
        require(sex == '男' || sex == '女'){
            println("你的性别：$sex ,不符合，抛出异常")
        }
    }

    constructor(userName: String) : this(userName, 88, '男') {
        println("次构造函数被调用：$userName")
    }
}

fun main() {
    KtBase75("张三",22,'男')
    println()
    KtBase75("赵柳")
}