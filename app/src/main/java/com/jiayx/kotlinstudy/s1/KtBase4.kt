package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/5/4
 kotlin 编译时常量
 编译时的常量 只能是 常用的基本数据类型 String,Int,Double,Char,Float,Long,Byte,Short,Boolean
 */
const val  PI = 3.1415926
// 编译时常量只能在函数之外定义，为什么?
// 答：如果在函数之内定义，就必须在运行时才能调用函数赋值，何来编译时常量一说
// 结论：编译时常量只能在函数之外定义，就可以在编译期间初始化
class KtBase4 {
// 提示：修饰符 const 不适用 局部变量
//    const val str = ""
}
