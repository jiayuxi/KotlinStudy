package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/12
todo kotlin语言中主构造函数中默认参数
 */
class KtBase74(name: String = "李元霸") {
    // 主构造
    // 2个参数的次构造，必须调用主构造函数，否则不通过
    /*
     *为什么必须调用主构造？
     * 答：主构造同一管理，为了更好的初始化设置
     */
    constructor(name: String = "秦始皇", sex: Char = 'M') : this(name) {
        println("2个参数的次构造函数 ：name:$name , sex:$sex")
    }

    // 3 个参数的次构造函数，必须调用主构造函数
    constructor(name: String = "武则天", sex: Char = 'N', age: Int = 1000) : this(name) {
        println("3个参数的次构造函数 ：name:$name , sex:$sex , age:$age")
    }
}

fun main() {
    // 调用主构造
    val p = KtBase74("秦琼")
    //调用2个参数的次构造函数
    KtBase74("赵丽", '女')
    //调用3个参数的次构造函数
    KtBase74("王五", '男', 30)
    KtBase74() // 到底调用哪一个函数？答：优先调用主构造函数
}