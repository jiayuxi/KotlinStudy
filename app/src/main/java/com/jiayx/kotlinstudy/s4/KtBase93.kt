package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/13
todo kotlin 语言 泛型函数
 */
class KtBase93<T>(private val obj: T, private val isR: Boolean) {
    fun getObj() = obj.takeIf { isR }
}

data class Student93(val name: String, val age: Int, val sex: Char)
data class Teacher93(val name: String, val age: Int, val sex: Char)

fun main() {
    val s1 = Student93("王五", 30, '男')
    val s2 = Student93("赵四", 26, '女')
    val p1 = Teacher93("赵柳", 27, '男')
    val p2 = Teacher93("赵信", 28, '女')
    println(KtBase93(s1, true).getObj())
    println(KtBase93(s2, true).getObj())
    println(KtBase93(p1, true).getObj())
    println(KtBase93(p2, true).getObj())
    println(KtBase93(p1, false).getObj() ?: "万能返回器是返回的 null")
    println()
    // 对象打印 + run + ?:

    val result: String? = KtBase93(p1, false).getObj()?.run {
        "万能对象：$this"
    } ?: "万能返回器 返回的类型 为 null"
    println(result)
    println()
    // 对象打印 + apply + ?:
    val result1: Student93? = KtBase93(s2, true).getObj().apply {
        if (this == null) {
            println("万能返回器 返回的 是 null")
        } else {
            println("万能对象：$this")
        }
    }
    println(result1)
}
