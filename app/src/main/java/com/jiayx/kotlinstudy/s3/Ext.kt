package com.jiayx.kotlinstudy.s3

/**
 *Created by yuxi_
on 2022/4/15
 */
// 扩展文件
// 1、扩展一般都用 public ，使用private 外界无法使用
// 2、Iterable<E> 子类 list,set 都可以，所以用父类
// 3、本次扩展函数的作用是 随机去第一个元素 返回
fun <E> Iterable<E>.randomItemValue() = this.shuffled().first()
fun <T> Iterable<T>.randomItemValuePrint() = println(this.shuffled().first())

