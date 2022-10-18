package com.jiayx.kotlinstudy.s6

import java.io.File

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 语言 DSL 语言 学习
 */

class Context {
    val info = "DSL 语言学习"
    val name = "kotlin"
    fun toast(str: String) = println("toast:$str")
}

inline fun Context.apply5(lambda: Context.(String) -> Unit): Context {
    lambda(info)
    return this
}

inline fun <I> I.apply6(lambda: I.(String) -> Unit): I {
    lambda("kotlin")
    return this
}

// 传递两个参数
inline fun File.apply5(lambda: File.(String, String) -> Unit): File {
    lambda(name, readLines()[0])
    return this
}

fun main() {
    // 其实 apply5函数， 就是DSL编程范式，定义输入输出等规则
    // 1、定义整个lambda规则标准，输入 必须是Context 这个类，才有资格调用 apply5 函数，匿名函数
    // 2、定义真个lambda规则标准，输出 我们会始终返回 Context 对象
    // apply5 持有两个对象，一个是 传入 String 也就是it对象，一个 是 this 对象
    val context = Context().apply5 {
        // it == String == "DSL 语言学习"
        println("我的 it 是：$it, 我的this是：$this")
        toast("Success")
        toast(it)
        toast(name)
    }
    println()
    val lambda: Context.(String) -> Unit = {
        println("我的 it是：$it ,我的 this 是：$this")
        toast(it)
        toast(name)
    }
    Context().apply6(lambda)
    println()
    println(context.info)

    println()
    val file = File("D:\\file.txt").apply5 { fileName: String, data: String ->
        println("文件名称：$fileName,文件内容：$data")
    }
    println("输出的文件名称：${file.name}")
}