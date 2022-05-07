package com.jiayx.kotlinstudy.s3

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 takeUnless 内置函数
takeUnless {true / false } true 返回 null, false 返回调用者本身
 */
class Manager {
   private var infoValue: String? = null
//    get() {
//        if(field == null){
//            field = "你怎么没有赋值 就开始使用"
//        }
//        return field
//    }
    fun getInfoValue() = infoValue

    fun setInfoValue(str: String) {
        this.infoValue = str
    }
}

fun main() {
  val manager = Manager()

    val result = manager.getInfoValue().takeUnless { it.isNullOrBlank() } ?: "你怎么没有赋值 就开始使用"
    println(result)
}