package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/18
TODO kotlin 语言 泛型类型约束
 */
open class MyAnyClass(name: String)//顶级父类
open class PersonClass(name: String) : MyAnyClass(name = name)//父类
class StudentClass(name: String) : PersonClass(name)// 子类
class TeacherClass(name: String) : PersonClass(name)// 子类
class DogClass(name: String)// 其他类

//T : PersonClass 相当于 Java 的 T extends PersonClass
// PersonClass 和 PersonClass 的子类都可以使用，其他类，都不能兼容此泛型
class KtBaseConstraint<T : PersonClass>(
    private val inputClass: T,
    private val isR: Boolean = true
) {
    //万能返回器
    fun getObject(): T? = inputClass.takeIf { isR }
}

fun main() {
    val any = MyAnyClass("kotlin") //顶级父类
    val per = PersonClass("kotlin")// 父类
    val student = StudentClass("kotlin")
    val teacher = TeacherClass("kotlin")
    val dog = DogClass("kotlin")

//    val myAnyClass = KtBaseConstraint(any).getObject()
//    println(myAnyClass)
    val perClass = KtBaseConstraint(per).getObject()
    println(perClass)
    val studentClass = KtBaseConstraint(student).getObject()
    println(studentClass)
    val teacherClass = KtBaseConstraint(teacher).getObject()
    println(teacherClass)
//    val dogClass = KtBaseConstraint(dog).getObject()
//    println(dogClass)
}
