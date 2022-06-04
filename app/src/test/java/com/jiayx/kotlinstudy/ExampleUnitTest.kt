package com.jiayx.kotlinstudy

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
       val arrList = listOf("1000","2000","3000","1000")
        println("判断值是否存在：" + arrList.stream().filter { "1000" == it }.findAny().isPresent)
    }
}