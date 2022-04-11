package lambda

/**
 *Created by yuxi_
on 2022/4/10
 模拟登录
 */

fun main() {
  loginAction("Jiayx","123456"){
      if(it) println("收到服务器的相应，登录成功") else println("收到服务器的相应，登录失败")
  }
    123.function()
    123.jiayx{ t1,t2,t3,t4 ->
        println()
        false
    }
}
/**
 * 模仿登录
 */
fun loginAction(userName: String, password: String, loginResponseResult: (Boolean) -> Unit) {
    if (userName.isEmpty()|| password.isEmpty()) {
        return
    }
    loginEngine(userName,password,loginResponseResult)
}

/**
 * 真正的登录
 */
private fun loginEngine(
    userName: String,
    password: String,
    loginResponseResult: (Boolean) -> Unit
) {
    if (userName == "Jiayx" && password == "123456") {
        loginResponseResult.invoke(true)
    } else {
        loginResponseResult.invoke(false)
    }
}