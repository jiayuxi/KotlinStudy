package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/12
 todo kotlin 语言的结构声明学习
 */
// 普通类
class Student3(var name:String,var age:Int,var sex:Char){
     // 注意事项：component0 顺序必须是
     // component1,component2,component3 和成员 一一对应，顺序下来
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = sex
}

// 数据类
data class Student4(var name:String,var age:Int,var sex:Char)
fun main() {
    // 数据结构
    val(name,age,sex) = Student3("王五",25,'男')
    println("普通类 结构后：name:$name , age:$age , sex:$sex")
    // 数据类
    val(name1,age1,sex1) = Student4("赵柳",20,'女')
    println("数据类 结构后：name1:$name1 , age1:$age1 , sex1:$sex1")
    // _ 拒绝接收数据
    val(_,age2,_) = Student4("张三",26,'A')
    println("结构后 拒绝接收数据：age:$age2")
}