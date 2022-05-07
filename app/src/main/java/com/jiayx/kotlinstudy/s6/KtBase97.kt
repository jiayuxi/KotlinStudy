package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/15
todo kotlin 语言 reified 关键字学习

 */

data class ObjectClass1(val name: String, val age: Int, val info: String)
data class ObjectClass2(val name: String, val age: Int, val info: String)
data class ObjectClass3(val name: String, val age: Int, val info: String)

class KtBase97 {
    // 高阶函数
    inline fun <reified T> randomOrDefault(defaultLambdaAction: () -> T): T? {
        val objects: List<Any> = listOf(
            ObjectClass1("obj1 张三", 25, "学习kotlin"),
            ObjectClass2("obj2 李四", 26, "学习Java"), ObjectClass3("obj3 王五", 28, "学习C++")
        )
        val randObj: Any? = objects.shuffled().first()
        println("随机产生的幸运儿是 ：$randObj")
        return randObj.takeIf { it is T } as T? ?: defaultLambdaAction()
    }
}

fun main() {
    val objectClass = KtBase97().randomOrDefault<ObjectClass1> {
        println("由于随机产生的对象和我们指定的ObjectClass1 对象不一致，所以启动备用对象")
        ObjectClass1("备用 赵柳", 22, "学习 kotlin 的 reified 关键字")
    }
    println(objectClass)
}