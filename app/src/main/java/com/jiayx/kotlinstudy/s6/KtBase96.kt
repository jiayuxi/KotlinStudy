package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/14
todo kotlin 语言 in - 逆变
父类泛型对象可以赋值给子类泛型对象,用in
 */
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>消费者学习

// 消费者 in T 逆变[in T 此泛型能够被修改，更新 所以是 in]
interface Consumer<in T> {
    // in T 代表整个消费者类里面，这个 T 只能被修改，不能被读取
    // 只能被修改
    fun consumer(item: T)
    //不能被读取
//    fun produce() : T
}

class ConsumerClass1 : Consumer<Animal> {
    override fun consumer(item: Animal) {
        println("消费者 Animal")
    }
}

class ConsumerClass2 : Consumer<Humanity> {
    override fun consumer(item: Humanity) {
        println("消费者 Humanity")
    }
}

class ConsumerClass3 : Consumer<Man> {
    override fun consumer(item: Man) {
        println("消费者 Man")
    }

}

class ConsumerClass4 : Consumer<WoMan> {
    override fun consumer(item: WoMan) {
        println("消费者 WoMan")
    }
}

/*
 * 默认情况下，泛型具体出的父类 是不能赋值给 泛型声明处的子类的
 * in : 泛型具体出的父类 是可以赋值给 泛型声明处的子类
 * 逆变 ：泛型声明处的子类 是可以 接收 泛型具体出的父类
 */
fun main() {
    val p1: Consumer<Man> = ConsumerClass1()
    val p2: Consumer<WoMan> = ConsumerClass2()

    p1.consumer(Man())
    // 默认情况下，泛型具体出的父类 是不能赋值给 泛型声明处的子类的
    // in : 泛型具体出的父类 是可以赋值给 泛型声明处的子类
    // 逆变 ：泛型声明处的子类 是可以 接收 泛型具体出的父类
}

private fun function(id: Int) {
    var id = id
    for (value in 0..4) {
        println(++id)
    }
}