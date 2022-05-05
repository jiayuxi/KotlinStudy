package com.jiayx.kotlinstudy.s2

/**
 *Created by yuxi_
on 2022/5/5
kotlin 语言 函数内联函数学习
 */

fun main() {
    //第一种方式
    loginApi2("kotlin", "123456",{ result: String, code: Int ->
        println("最终登录的消息：result:$result , code: $code")
    })
    // 第二种方式
    loginApi2("kotlin", "123456", responseResult = { result: String, code: Int ->
        println("最终登录的消息：result:$result , code: $code")
    })
    //第三种方式
    // 模拟登录
    loginApi2("kotlin", "123456") { result: String, code: Int ->
        println("最终登录的消息：result:$result , code: $code")
    }
}

const val USER_NAME_SAVE_DB2 = "kotlin"
const val USER_PASSWORD_SAVE_DE2 = "123456"
// 此函数有使用lambda 作为参数，就需要声明成内联
// 如果此函数，不声明内联，在调用端，会生成多个对象来完成lambda的调用(会造成性能的损耗)
// 如果此函数，使用内联，相当于 C++ 中的#define 宏定义，宏替换，会把代码替换到调用处，
// 调用处没有任何函数开辟，对象开辟的损耗
// 小结：如果函数参数有lambda，尽量使用inline 关键字，减少函数开辟，对象开辟的损耗
// 模仿 登录 API
private inline fun loginApi2(
    userName: String,
    userPassword: String,
    responseResult: (String, Int) -> Unit
) {
    if (userName == null || userPassword == null) TODO("登录账号或密码为空")
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

// 模仿服务器 校验登录
fun webServiceLoginApi2(userName: String, userPassword: String): Boolean {
    return userName == USER_NAME_SAVE_DB && userPassword == USER_PASSWORD_SAVE_DE
}


