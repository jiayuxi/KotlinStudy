package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/12
todo kotlin 枚举类定义函数学习
代数数据类型(简称 ADT)：可以用来表示一组子类型的闭集。枚举就是一种简单的 ADT
 */

data class LimbsInfo(var limbsInfo: String, var length: Int) {
    fun show() {
        println("${limbsInfo}的长度是:$length")
    }
}

// 枚举的 主构造的参数 必须和 枚举的(参数)保持一致
enum class Limbs(private var limbsInfo: LimbsInfo) {
    LEFT_HAND(LimbsInfo("左手", 88)),
    RIGHT_HAND(LimbsInfo("右手", 88)),
    LEFT_FOOT(LimbsInfo("左脚", 140)),
    RIGHT_FOOT(LimbsInfo("右脚", 140))
    ;// 结束枚举值

    fun show() = println("四肢是：${limbsInfo.limbsInfo}的长度是：${limbsInfo.length}")

    // 修改参数
    fun updateLimbsInfo(limbsInfo: LimbsInfo) {
        this.limbsInfo.limbsInfo = limbsInfo.limbsInfo
        this.limbsInfo.length = limbsInfo.length
    }
}

fun main() {
    Limbs.LEFT_HAND.show()
    Limbs.RIGHT_HAND.show()
    Limbs.LEFT_FOOT.show()
    Limbs.RIGHT_FOOT.show()

    println()
    Limbs.LEFT_HAND.updateLimbsInfo(LimbsInfo("左手", 99))
    Limbs.LEFT_HAND.show()
}