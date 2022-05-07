package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/17
 */
interface Movable {
    var maxSpeed: Int
        get() = (1..500).shuffled().last()
        set(value) {}
    var wheels: Int

    fun move(move: Movable): String
}

class Car(_name: String, override var wheels: Int) : Movable {
    override var maxSpeed: Int
        get() = super.maxSpeed
        set(value) {}

    override fun move(move: Movable): String {
        TODO("Not yet implemented")
    }
}

fun main() {

}