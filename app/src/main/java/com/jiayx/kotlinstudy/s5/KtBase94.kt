package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/13
todo kotlin 语言泛型实战
 */

class KtBase94<T>(val isMap: Boolean = false, val inputType: T) {
    // 模仿Rxjava T要变化的输入类型 R 是变换后的输出类型
    // map 返回的类型是 R? ，takeIf 返回值 可能是 R 可能是 null
    inline fun <R> map(mapAction: (T) -> R): R? = mapAction(inputType).takeIf { isMap }
}

// I 输入参数，O 输出参数
inline fun <I, O> map(inputType: I, isMap: Boolean = true, lambdaAction: (I) -> O): O? {
    return if (isMap) {
        lambdaAction(inputType)
    } else {
        null
    }
}

//
fun main() {
    val p1 = KtBase94(/*true*/false, 123)
    val result = p1.map {
        it //lambda 最后一行是 返回值
        it.toString()
    }
    println(result)
    println(result is String)
    println(result is String?)
    println()
    val p2 = KtBase94(true, Persons("张三", 40))
    val student: Students? = p2.map {
        Students(it.name, it.age)
    }
    println(student)

    println()
   val r : String? =  map("hello"){
       "value:$it" // lambda 最后一行就是返回值
    }
    println(r)
}

data class Students(val name: String, val age: Int)
data class Persons(val name: String, val age: Int)