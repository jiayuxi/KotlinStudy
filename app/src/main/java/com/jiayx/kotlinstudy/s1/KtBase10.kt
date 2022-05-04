package com.jiayx.kotlinstudy.s1

/**
 *Created by yuxi_
on 2022/5/4
 kotlin 语言 函数参数的默认参数,具名函数采参数
 */

fun main() {
   function("李四",26)
   function(age = 29,name = "李四")
    function02("王五")
    function02(age = 25, name = "")

    function03(name = "赵柳")

}

private fun function(name:String?,age:Int?){
    println("name:$name , age:$age")
}
private fun function02(name:String?,age:Int? = 26){
    println("name:$name , age:$age")
}
private fun function03(age:Int? = 26,name:String?){
    println("name:$name , age:$age")
}
