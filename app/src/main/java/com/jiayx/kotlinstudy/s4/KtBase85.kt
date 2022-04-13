package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/12
todo kotlin 语言的嵌套类学习
 */
// todo 内部类
// 内部类的特点：内部类 能访问 外部类
//             外部类 能访问 内部类
class Body(_bodyInfo: String) { // 身体类
    val bodyInfo = _bodyInfo
    fun show() {
        Heart().run()
    }

    // 默认情况下，内部类 不能访问 外部类，要增加修饰符(inner)称为内部类，才可以访问外部类
    inner class Heart { // 心脏类
        fun run() = println("心脏访问身体信息：$bodyInfo")
    }

    inner class Kidney { //肾脏类
        fun run() = println("肾脏访问身体信息：$bodyInfo")
    }

    inner class Hand {
        // 手
        inner class LiftHand {
            fun run() = println("左手访问身体信息：$bodyInfo")
        }

        inner class RightHand {
            fun run() = println("右手访问身体信息：$bodyInfo")
        }
    }
}

// TODO 嵌套类
// 默认情况下 就是嵌套的关系
// 嵌套类特点：外部类 能访问 内部类
//           内部类 不能访问 外部类
class Outer{
    fun show(){
       Nested().outPut()
    }
    class Nested{
       fun outPut() = println("内部类成员")
    }
}

fun main() {
    Body("王五").Heart().run()
    Body("王五").Kidney().run()
    Body("王五").Hand().LiftHand().run()
    Outer().show()
}