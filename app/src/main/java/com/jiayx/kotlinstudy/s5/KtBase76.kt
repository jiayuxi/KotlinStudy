package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/12
 todo kotlin 语言构造初始化顺序
 */
//初始化第一步
class KtBase76(_name:String,sex:Char){
    // 初始化第二步 由于你是写在 init代码块之前，
    // 所有先生成你，其实类成员和init代码块同时生成
    val name = _name
    init {
        // 初始化第三步
        val nameValue = _name
        println("init 代码块 ：nameValue:$nameValue")
    }

    constructor(name:String,age:Int,sex:Char):this(name,sex){
        // 初始化第五步
        println("次构造函数初始化三个参 name:$name,age:$age,sex:$sex")
    }
    // 初始化第四步
    val info = "kotlin"
}
fun main() {
   KtBase76("张三",20,'男')
}