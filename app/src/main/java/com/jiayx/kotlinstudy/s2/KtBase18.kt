package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言 在函数中定义参数是函数的函数
 */

fun main() {
    //第一种方式
    loginApi("kotlin", "123456",{ result: String, code: Int ->
        println("最终登录的消息：result:$result , code: $code")
    })
    // 第二种方式
    loginApi("kotlin", "123456", responseResult = { result: String, code: Int ->
        println("最终登录的消息：result:$result , code: $code")
    })
    //第三种方式
    // 模拟登录
    loginApi("kotlin", "123456") { result: String, code: Int ->
        println("最终登录的消息：result:$result , code: $code")
    }
}

const val USER_NAME_SAVE_DB = "kotlin"
const val USER_PASSWORD_SAVE_DE = "123456"

// 模仿 登录 API
private fun loginApi(
    userName: String,
    userPassword: String,
    responseResult: (String, Int) -> Unit
) {
    if (userName == null || userPassword == null) TODO("登录账号或密码为空")
    // 校验
    if (userName.length > 3 && userPassword.length > 3) {
        if (webServiceLoginApi(userName, userPassword)) {
            // 登录成功
            // 检验数据 等
            responseResult("登录成功", 200)
        } else {
            // 登录失败
            responseResult("登录失败", 400)
        }
    }
}

// 模仿服务器 校验登录
private fun webServiceLoginApi(userName: String, userPassword: String): Boolean {
    return userName == USER_NAME_SAVE_DB && userPassword == USER_PASSWORD_SAVE_DE
}


