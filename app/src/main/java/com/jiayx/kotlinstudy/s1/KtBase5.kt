package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/5/4
 kotlin 语言的 引用类型学习
 */
/*
* Java 语言有两种数据类型：
* 第一种： 基本数据类型：int ,float,double 等
* 第二种：引用数据类型，String,Double 等
*
* Kotlin 语言：
* 只有一种数据类型，引用数据类型 ： String,Double,Float 等
* 看起来是都是引用数据类型，实际上编译器会在Java 字节码中，修改成 "基本数据类型"
*
*
* */
fun main() {
    val age:Int = 99
    val pi:Float = 3.1415f
    val pi2:Double = 3.1415
    val isOk:Boolean = true
}