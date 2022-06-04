package com.jiayx.kotlinstudy.s9

import android.content.Context
import android.view.View
import kotlin.reflect.KProperty

/**
 *Created by yuxi_
on 2022/5/14
kotlin 语言 委托
 */

class InvalidateDelegate<T : Any>(var value: T) {
    operator fun getValue(thisRef: View, property: KProperty<*>) = value
    operator fun setValue(thisRef: View, property: KProperty<*>, value: T) {
        this.value = value
        thisRef.postInvalidateOnAnimation()
    }
}

class MyMainView(context: Context?) : View(context) {
     var foregroundX by InvalidateDelegate(0f)
}

fun main() {
     val mainView = MyMainView(context = null)
      
}