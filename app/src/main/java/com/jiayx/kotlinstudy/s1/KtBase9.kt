package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/5/4
kotlin 语言的函数
 */

fun main() {
    function(20,"王五")
}

/*
  默认是public 修饰   函数声明关键字      函数名       函数参数             函数返回类型
* private                fun        function (age:Int,name:String) :      Int
* */
private fun function(age: Int, name: String): Int {
    println("你的名字是：$name , 你的年龄：$age")
    return 200
}
/*
* 上面的方法背后的代码：
*
* public final class KtBase9Kt{
* public static final main(){
*  function(20,"王五");
* }
*
* public static final main(String[] var0){
*    main();
* }
* private static final int function(int age,String name){
*    String var2 = "你的名字是：" + name + ", 你的年龄是： " + age;
*    System.out.println(var2)
*    return 200;
*  }
* }
* */