package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/14
 todo kotlin 语言 in - 逆变
 */
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>消费者学习

class ConsumerClass1 : Consumer<Animal> {
    override fun consumer(item: Animal) {
        println("消费者 Animal")
    }
}

class ConsumerClass2 : Consumer<Humanity> {
    override fun consumer(item : Humanity){
        println("消费者 Humanity")
    }
}

class ConsumerClass3 : Consumer<Man> {
    override fun consumer(item:Man){
        println("消费者 Man")
    }

}

class ConsumerClass4 : Consumer<WoMan> {
    override fun consumer(item:WoMan){
        println("消费者 WoMan")
    }
}

fun main() {
    val p1 : Consumer<Man> = ConsumerClass1()
    val p2 : Consumer<WoMan> = ConsumerClass2()
    // 默认情况下，泛型具体出的父类 是不能赋值给 泛型声明处的子类的
    // in : 泛型具体出的父类 是可以赋值给 泛型声明处的子类
    // 逆变 ：泛型声明处的子类 是可以 接收 泛型具体出的父类
}