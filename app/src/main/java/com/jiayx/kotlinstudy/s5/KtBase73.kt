package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/12
todo 次构造函数
 */
class KtBase73(name: String) {
    // 主构造
    // 2个参数的次构造，必须调用主构造函数，否则不通过
    /*
     *为什么必须调用主构造？
     * 答：主构造同一管理，为了更好的初始化设置
     */
    constructor(name: String, sex: Char) : this(name) {
        println("2个参数的次构造函数 ：name:$name , sex:$sex")
    }

    // 3 个参数的次构造函数，必须调用主构造函数
    constructor(name: String, sex: Char, age: Int) : this(name) {
        println("3个参数的次构造函数 ：name:$name , sex:$sex , age:$age")
    }
}

fun main() {
    // 调用主构造
    val p = KtBase73("秦琼")
    //调用2个参数的次构造函数
    KtBase73("赵丽", '女')
    //调用3个参数的次构造函数
    KtBase73("王五", '男', 30)
}