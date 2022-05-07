package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/15
todo kotlin 语言 属性扩展函数
 */

val myStr: String = "Kotlin"

/*
* 背后的代码实现
*  public final class KtBast101Kt {
*   public static final String myStr = "Kotlin"
*   @NotNull
*   public static final String getMyStr(){
*    return myStr;
*   }
* }
* */
//扩展属性
val String.myInfo: String
    get() = "kotlin"

/*背后的代码实现逻辑
* public final class KtBase101Kt{
*   public static final Sting myStr = "kotlin"
*
*   @NotNull
*   public static final String getMyStr() {
*   return myStr;
*  }
*
*  @NotNull
*  public static final String getMyInfo(@NotNull String $this$myInfo){
*   //检验扩展属性是否为 null
*   Intrinsics.checkNotNullParameter($this$myInfo, "$this$myInfo");
*   return "kotlin"
* }
*
* }
* */
// 打印输入并且链式调用（只有String 才可以这样调用）
fun String.showPrintln(): String {
    println("打印输出并且链式调用(只有String 才可以这样调用：$this)")
    return this
}

//
val String.stringAllInfoValueVal
    get() = "当前${System.currentTimeMillis()}这个时间点调用一次，当前的值是：$this ,当前字符串的长度是:${this.length}"

fun main() {
    val str: String = "ABC"
    println("值：$str")
    //背后逻辑 showPrintln(showPrintln(showPrintln(str)))
    str.showPrintln().showPrintln().showPrintln()
    //背后逻辑 showPrintln(showPrintln(showPrintln(getMyInfo(str))))
    str.myInfo.showPrintln().showPrintln().showPrintln()
    //背后逻辑 showPrintln(showPrintln(showPrintln(getStringAllInfoValueVal("kotlin扩展属性学习"))))
    "kotlin扩展属性学习".stringAllInfoValueVal.showPrintln().showPrintln().showPrintln()
}


