package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言 函数引用的学习
 */

fun main() {
    // lambda 属于函数类型的对象，需要把 resultMethod 普通函数 变成 函数类型对象(函数引用)
    // ::resultMethod 通过 :: 转化为 函数类型的对象
    // 第一种方式调用
    login("kotlin", "123456", ::resultMethod)
    // 第二种方式调用：
    val obj = ::resultMethod
    val obj2 = obj
    login("kotlin", "123456", obj2)
}

// 函数
fun resultMethod(msg: String, code: Int) {
    println("登录返回：$msg,code:$code")
}

private inline fun login(
    userName: String,
    userPassword: String,
    responseResult: (String, Int) -> Unit
) {
    if (userName == null || userPassword == null) responseResult.invoke("账号密码为空", 500)
    // 校验
    if (userName.length > 3 && userPassword.length > 3) {
        if (webServiceLoginApi2(userName, userPassword)) {
            // 登录成功
            // 检验数据 等
            responseResult("登录成功", 200)
        } else {
            // 登录失败
            responseResult("登录失败", 400)
        }
    }
}
