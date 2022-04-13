package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/13
 TODO kotlin 语言定义泛型类
 */
class KtBase92<T>(private val obj:T){
    fun show(){
        println("万能输出器：$obj")
    }
}

data class Student92(val name:String,val age:Int,val sex:Char)
data class Teacher92(val name:String,val age:Int,val sex:Char)

fun main() {
    KtBase92(Student92("张三",24,'男')).show()
    KtBase92(Student92("李四",26,'女')).show()
    KtBase92(Teacher92("王五",28,'男')).show()
    KtBase92(Teacher92("赵柳",26,'女')).show()

    KtBase92(String("蛀虫吧".toByteArray())).show()
    KtBase92(123).show()
    KtBase92(123f).show()
    KtBase92(123L).show()

}