package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/12
todo kotlin 语言 密封类
 */
// 密封类，我们成员 就必须有类型 并且继承本类
sealed class Exams {
    object Fraction1 : Exams()
    object Fraction2 : Exams()
    object Fraction3 : Exams()
    class Fraction4(val studentName: String) : Exams()
}

class Teacher(private val exams: Exams){
    fun show() = when(exams){
        is Exams.Fraction1 -> "该学生分数很差"
        is Exams.Fraction2 -> "该学生分数及格"
        is Exams.Fraction3 -> "该学生分数良好"
        is Exams.Fraction4 -> "该学生分数优秀，该学生的姓名是：${this.exams.studentName}"
    }
}

fun main() {
    println(Teacher(Exams.Fraction1).show())
    println(Teacher(Exams.Fraction2).show())
    println(Teacher(Exams.Fraction3).show())
    println(Teacher(Exams.Fraction4("赵丽")).show())
    println(Teacher(Exams.Fraction4("马三")).show())
}