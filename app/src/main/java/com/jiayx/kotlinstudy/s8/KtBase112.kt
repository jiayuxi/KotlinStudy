package com.jiayx.kotlinstudy.s8

/**
 *Created by yuxi_
on 2022/4/17
todo 注解 @JvmField 与 kotlin
 */

class Person2 {
    /* 背后的代码
    @JvmField
    @NotNull
    public final List names = CollectionsKt.listOf(new String[]{"战三", "张武", "张柳"});
    * */
    @JvmField
    val names = listOf("战三", "张武", "张柳")
}