package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/12
todo kotlin 语言 的对象表达式
object : 对象 {}
 */
interface RunnableKt {
    fun run()
}

open class KtBase83 {
    open fun add(info: String) = println("KtBase83 add :$info")
    open fun del(info: String) = println("KtBase83 del :$info")
}

// 1、匿名对象表达式 （没有名字）
// 2、具名对象表达式 （有名字）
// 3、对Java的接口，使用对象表达式
// 总结：1、Java 接口有两种方式实现，1：（object：对象表达式） 2：简洁版
//      2、kotlin 接口只有一种实现方式，object：对象表达式
fun main() {
    //匿名对象表达式
    val p = object : KtBase83() {
        override fun add(info: String) {
            println("我是匿名对象：add:$info")
        }

        override fun del(info: String) {
            println("我是匿名对象：del:$info")
        }
    }
    p.add("李元霸")
    p.del("李世民")
    println()
    // 具名表达式
    val pImpl = KtBase83Impl()
    pImpl.add("乌骓")
    pImpl.del("绝影")
    // java 接口 对象表达式 方式 1
    val run = object : Runnable {
        override fun run() {
            println("Runnable run ...")
        }
    }
    run.run()
    // 对Java的接口用简洁版实现 方式二
    val run2 = Runnable { println("Runnable run 方式二") }
    run2.run()

    //kotlin 接口对象表达式 实现
    val runKt = object : RunnableKt {
        override fun run() {
            println("kotlin 接口对象表达式实现")
        }
    }
    runKt.run()
}

private class KtBase83Impl : KtBase83() {
    override fun add(info: String) {
        println("我是具名对象：add:$info")
    }

    override fun del(info: String) {
        println("我是具名对象：del:$info")
    }
}