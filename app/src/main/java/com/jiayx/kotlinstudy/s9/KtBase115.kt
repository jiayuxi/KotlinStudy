package com.jiayx.kotlinstudy.s9

/**
 *Created by yuxi_
on 2022/4/17
todo 手写事件变换操作符
 */

fun main() {
    create { //万能类型，返回最后一行
        123
    }.map {
        "你输入的值：$this"
    }.map {
        "[$this]"
    }.map {
        "@@$this@@"
    }.observer {
        println(this)
    }
}

// 中转站 ，保存我们的记录，valueItem == create 操作符 最后一行的返回值 流向此处
class RxJavaCoreObjectClass<T>(var valueItem: T)//主构造，接收你传递来的信息。create 最后一行的返回值

// 对RxjavaCoreObjectClass 对象进行 map 扩展,返回新的输出RxJavaCoreObjectClass对象
// I 输入参数，O 输出参数
inline fun <I, O> RxJavaCoreObjectClass<I>.map(mapAction: I.() -> O) =
    RxJavaCoreObjectClass(mapAction(valueItem))

inline fun <I> RxJavaCoreObjectClass<I>.observer(observerAction: I.() -> Unit) =
    observerAction(valueItem)

inline fun <OUTPUT> create(action: () -> OUTPUT) = RxJavaCoreObjectClass((action()))