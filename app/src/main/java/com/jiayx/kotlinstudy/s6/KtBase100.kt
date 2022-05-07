package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/15
todo kotlin 语言 标准函数与泛型扩展函数
 */
// private 私有化，
// inline 我们函数是高阶函数，所有用到内联函数，做 lambda 的优化，性能提高
// fun<I,O> 在函数中，申明两个泛型，两个泛型：I 输入Input,O 输入 Output
//I.mLet 对 I 输入 Input 函数进行扩展，扩展函数名称 是 mLet,意味着 所有的类型，万能类型 都可以使用XXX.mLet
// lambda:(I) -> O ,(I)输入，O 输出
// : O 会根据用户的返回类型，变化而变化
// lambda(this) I 进行函数扩展，在整个函数扩展里面，  this == I 本身
private inline fun <I, O> I.mLet(lambda: (I) -> O) = lambda(this)

fun main() {
 val p : Boolean = "C".mLet {
      true
  }
}