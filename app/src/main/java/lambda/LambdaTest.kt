package lambda

import android.media.tv.TvView

/**
 *Created by yuxi_
on 2022/4/10
lambda 学习
 */
fun main() {
//    lambda函数()
    函数方式()
}

/**
 * 函数
 */
fun `lambda函数`() {
    //method2()
    method2.invoke()
    method3("学习 kotlin")
    method("学习kotlin", "学习 kotlin lambda 函数")
}

/**
 * 无参函数
 */
// method2 : () -> Unit
//           输入    输出
val method2: () -> Unit = { println("无参函数：Jiayx") }

/**
 * 带一个参数的函数
 */
val method3: (String) -> Unit = { println("带一个参数的函数 $it") }

/**
 * 多参函数
 */
val method: (String, String) -> Unit = { aStr, bStr -> println("多个参数的函数 aStr:$aStr ,bStr:$bStr") }

/**
 * 函数方式
 */
fun `函数方式`() {
    // todo 方式一 method01:() -> Unit
    // 这就是一个函数，只不过此函数 没有输入参数，没有输出参数
    val method01 = { println("我在学习kotlin lambda 方式") }
    // 两种方式的调用
//    println(method01())
    // invoke() 方法 method01() 的重载
    println(method01.invoke())

    // todo 方式二 method02:() -> String
    // 这就是一个函数，只不过这个函数 没有输入参数，有输出参数 String
    val method02 = { println("我是一个学习kotlin的学生") }
//    println(method02.invoke())
    println(method02())

    // todo 方式三 method03:(Int,Int) -> String
    //这就是一个函数，只不过这个函数有两个输入参数 Int,输出参数String
    val method03 = { number1: Int, number2: Int -> number1.toString() + number2.toString() }
    println(method03(100, 88))
    // todo 方式四 method04 : (Int,Int) -> Int
    val method04 = { num1: Int, num2: Int -> num1 + num2 }
    println(method04(22, 88))
    // todo 方式五
    var method05: (Int) -> String //函数的声明
    //函数事项
    method05 = fun(value: Int): String = value.toString() + "学习lambda 表达方式"
    println(method05.invoke(66))
    // todo 方式六
    // 函数声明 + 函数实现
    val method06: (Int, Int) -> String =
        fun(number1, number2): String = number1.toString() + number2.toString()
    println(method06.invoke(56, 86))

    // TODO 方式七
    val method07: (String, String) -> Unit = { aStr, bStr -> println("aStr:$aStr , bStr:$bStr") }
    method07("java", "kotlin")

    // todo 方式八
    val method08: (String) -> Int = {
        println("传入的参数值：$it")
        100
    }
    println(method08.invoke("hello"))

    // todo 方式九
    val method09: (Int) -> Unit = {
        when (it) {
            1 -> println("你传入的是 1")
            in 20..60 -> println("你传入的是 20..60 之间的值")
            else -> {
                println("都不满足")
            }
        }
    }
    method09.invoke(60)

    // TODO 方式十 拒绝收值 _
    val method10: (Int, Int) -> Unit = { _, number2 ->
        println("参数二是：$number2")
    }
    method10.invoke(8, 9)
    // todo 方式十一  可以输入任何参数，可以输出任何参数值
    val method11: (Any) -> Any = {
        it
    }
    println(method11.invoke(12))

    // TODO 方式十二

    val method12 =
        { sex: Char ->
            if (sex == '男') println("代表是先生")
            else if (sex == '女')
                println("代表是女生")
            else println("代表是未知人类")
        }
    method12.invoke('男')

    // TODO 方式十三 扩展函数，对谁扩展，this 等于 谁本身
    val method13: String.() -> Unit = {
        println("你调用了我 ，你是 :$this")
    }
    "kotlin".method13()
    "ADBC".method13()

    val result = 123.jiayx { t1, t2, t3, t4 ->
        println("t1:$t1 ,t2：$t2 ,t3: $t3 ,t4: $t4")
        false
    }
    println(result)

    // 三数相加
   val result1 = sum(12,25,26){t1,t2,t3 ->
        t1 + t2 + t3
    }
    println("三数相加：$result1")
    // 三数相乘
    val result2 = sum(12,25,26){t1,t2,t3 ->
        t1 * t2 * t3
    }
    println("三数相乘：$result2")
    // 三数相除
    val result3 = sum(100,25,26){t1,t2,t3 ->
        t1 / t2 / t3
    }
    println("三数相除：$result3")
    // 三数相减
    val result4 = sum(100,25,26){t1,t2,t3 ->
        t1 - t2 - t3
    }
    println("三数相减：$result4")
}

/**
 * 泛型扩展
 * 扩展函数 对谁扩展 this == 谁本身
 */

fun <T> T.function() = run { println("谁是调用者: $this") }

/**
 * 扩展函数
 *  T = 万能类型
 *  万能类型.jiayx : 所有的地方，所有类型都可以调用
 *  mm: 就是一个lambda 名字
 *  王能类型.() : 我们的lambda 会持有this ，this == 王能类型本身
 *  mm() 调用lambda
 */
// todo
inline fun <T> T.jiayx(mm: T.(T, T, T, T) -> Boolean) = mm(this, this, this, this)

/**
 * 定义一个 三数相加，三数相乘，三数相除，三数 相减的规则
 */
inline fun <R> sum(n1: Int, n2: Int, n3: Int, lambda: (Int, Int, Int) -> R?) = lambda(n1, n2, n3)