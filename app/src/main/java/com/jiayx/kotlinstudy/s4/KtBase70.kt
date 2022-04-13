package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/12
// todo kotlin 语言的 定义类 与 field 关键字
 */

class KtBase70 {
    var name = "kotlin"
    /*背后做的事情
      @NotNull
      private String name = "kotlin"
      @NotNull
      public String getName(){
        return this.name
      }
      public void setName(@NotNull String name){
        this.name = name
      }
    */
    // 下面的隐士代码，不写也有，就是下面的样子
    /*get() = field
    set(value) {
        field = value
    }*/

}

fun main() {
    val ktBase70 = KtBase70()
    println(ktBase70.name)
    ktBase70.name = "学习kotlin"
    println(ktBase70.name)
}