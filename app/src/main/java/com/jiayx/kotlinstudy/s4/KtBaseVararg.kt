package com.jiayx.kotlinstudy.s4

import android.speech.tts.SynthesisRequest
import java.sql.SQLOutput

/**
 *Created by yuxi_
on 2022/4/18
todo kotlin 语言 vararg 关键字 （动态参数）
 */
class KtBaseVararg<T>(vararg objects: T, var isR: Boolean = false) {
    //1、objectArray:Array<T>
    // out 我们的T 只能被读取 不能被修改
    private val objectArray: Array<out T> = objects

    // showObject(index)
    fun showObject(index: Int): T? = objectArray[index].takeIf { isR } ?: null

    // mapObj(index,变换lambda)
    fun <O> mapObj(index: Int, mapAction: (T?) -> O): O? =
        mapAction(objectArray[index].takeIf { isR } ?: null)

    //todo 运算符重载
    operator fun get(index: Int): T? = objectArray[index].takeIf { isR }
}

fun <INPUT> inputObj(item: INPUT) {
    // String? 能接收 空值 与 非空值，所有 String? 比 String 强大
    // 小结：异步处理泛型接收，都用String? 接收，规范化
    println((item as String?)?.length ?: "你传入的字符串为空")
}

//1、objectArray:Array<T>
//2、showObject(index)
//3、mapObj(index,变换lambda)
//4、p.showObject(index),mapObj(int -> str)
//5、p的类型，it 的类型
fun main() {
    val p: KtBaseVararg<Any?> =
        KtBaseVararg("kotlin", false, 123, 456f, 789.12, 'C', null, isR = true)
    println(p.showObject(0))
    println(p.showObject(1))
    println(p.showObject(2))
    println(p.showObject(3))
    println(p.showObject(4))
    println(p.showObject(5))
    println()

    // mapObj
    val r: Int? = p.mapObj(0) {
        it.toString().length
    }
    println("第零个元素字符串的长度：$r")
//    val mapAction: (Any?) -> String = {
//        "我的第三个元素是：$it"
//    }
//    p.mapObj(2, mapAction)
    val r2: String? = p.mapObj(2) {
        "我的第三个元素是：$it"
    }
    println(r2)
    println()
//    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    val p2: KtBaseVararg<String?> = KtBaseVararg("张三", "李四", "王五", "赵柳", null, isR = true)
    println(p2[0])
    println(p2[1])
    println(p2[2])
    println(p2[3])
    println(p2[4])
}