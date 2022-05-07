package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/12
todo kotlin 语言的对象声明学习
 */

object KtBase82 {
    /*
    * 背后的代码实现
    * public static final KtBase82 INSTANCE
    * private KtBase82(){} 主构造废除一样的效果
    * public final void show() {
    *   String var1 = "我是 show 函数"
    *   println(var1)
    * }
    * static{ // 静态代码块 只初始化一次
    * KtBase82 var0 = KtBase82()
    *  INSTANCE = var0
    *  String var1 = "KtBase82 init ..."
    *  println(var1)
    *
    * }
    *
    */
    init {
        println("KtBase82 init ...")
    }

    fun show() = println("我是 show 函数")
}

fun main() {
    // object KtBase82 即是单例的实例，也是类名
    // 小结：既然是单例实例，又是类名，只有一个创建，这就是典型的单例
    println(KtBase82)
    println(KtBase82)
    println(KtBase82)
    // 背后的调用代码 ：KtBase82.INSTANCE.show()
    println(KtBase82.show())
}