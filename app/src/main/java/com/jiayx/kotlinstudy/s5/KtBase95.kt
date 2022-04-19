package com.jiayx.kotlinstudy.s5

import java.lang.annotation.AnnotationTypeMismatchException

/**
 *Created by yuxi_
on 2022/4/14
todo kotlin 语言out-协变式学习
小结：子类泛型对象 可以赋值给 父类泛型对象 使用 out
 */
// 生产者 out T 协变 [out T 此泛型能够被获取，读取 ，所以是 out]
interface Producer<out T> {
    // out T 代表整个生产者类里面，这个 T 只能被读取，不能被修改
    // 不能被修改，编译不通过
//    fun consumer(item : T) //
    // 只能被读取
    fun producer(): T
}

// 生产者&消费者 默认是T 不变
interface ProducerAndConsumer<T> {
    // 能被获取
    fun producer(): T

    // 能被修改
    fun consumer(item: T)
}

open class Animal //
open class Humanity : Animal()
open class Man : Humanity()
open class WoMan : Humanity()

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>生产者学习

class ProducerClass1 : Producer<Animal> {
    override fun producer(): Animal {
        println("生产者 Animal")
        return Animal()
    }

}

class ProducerClass2 : Producer<Humanity> {
    override fun producer(): Humanity {
        println("生产者 Humanity")
        return Humanity()
    }

}

class ProducerClass3 : Producer<Man> {
    override fun producer(): Man {
        println("生产者 Man")
        return Man()
    }

}

class ProducerClass4 : Producer<WoMan> {
    override fun producer(): WoMan {
        println("生产者 WoMan")
        return WoMan()
    }

}

fun main() {
    val producerClass1 : Producer<Animal> = ProducerClass1()
    val producerClass2 : Producer<Animal> = ProducerClass2()
    val producerClass3 : Producer<Animal> = ProducerClass3()
    val producerClass4 : Producer<Animal> = ProducerClass4()
    //默认情况下，泛型的子类对象不能赋值给泛型父类对象
    // out (? extends T): 泛型的子类对象，可以赋值给泛型的父类对象
    // 协变 父类泛型声明处 可以接收 子类泛型声明处
}