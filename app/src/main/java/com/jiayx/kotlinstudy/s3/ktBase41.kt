package com.jiayx.kotlinstudy.s3

/**
 *Created by yuxi_
on 2022/5/7
kotlin 语言 takeIf 内置函数
takeIf 返回值是true 返回 调用者本身
takeIf 返回值是 false 返回 null
小结：一般大部分情况下， 都是 takeIf + 空合并操作符 = 一起使用
 */

fun main() {
    val result = checkPermissionAction("kotlin", "123456")
    // if 是表达式
    if (result != null) {
        println("欢迎 $result 登陆超级VIP系统")
    } else {
        println("权限不够，请升级 VIP 权限")
    }
    println(result)
    println(checkPermissionAction2("kotlin", "12345"))
}

private fun checkPermissionAction(name: String, password: String): String? {
    return name.takeIf { permissionSystem(name, password) }
}

private fun checkPermissionAction2(name: String, password: String): String {
    return name.takeIf { permissionSystem(name, password) } ?: "权限不够,请升级 VIP 权限"
}

private fun permissionSystem(name: String, password: String): Boolean {
    return name == "kotlin" && password == "123456"
}