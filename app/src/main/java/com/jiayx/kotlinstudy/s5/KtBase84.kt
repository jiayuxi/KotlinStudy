package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/12
 todo kotlin 语言 伴生对象 companion object
 */
class KtBase84 {
    // 半生对象
    companion object{
      val info = "伴生对象的学习"
      fun show() = println("显示：$info")
    }
    /*
    *companion object 背后的逻辑
    * public static final String info = "伴生对象的学习"
    * public static final KtBase84.Companion companion = new KtBase84.Companion((DefaultConstructorMarker)null)
    *
    * public static final class companion {
    * public final String getInfo() {
    *  return KtBase84.info
    * }
    * public final void show() {
    *   String val0 = "显示:" + ((KtBase84.Companion)this).getInfo();
    *   System.out.println(val0)
    * }
    * private Companion(){}
    *
    * }
    * public Companion(DefaultConstructorMarker $constructor_marker){
    *    this();
    * }
    *
    *
    *
    */
}
/*
* 伴生对象的由来：kotlin 中没有没有Java的这种static 静态，
* 伴生很大程度上和Java 的这种static 差不多
*
* TODO 伴生对象：无论对象创建多少次，伴生对象只有一次加载
*
*/
fun main() {
    // 背后的代码 ：System.out.println(KtBase84().Companion.getInfo())
    println(KtBase84.info)
    //背后的代码：System.out.println(KtBase84().Companion.show())
    println(KtBase84.show())
}