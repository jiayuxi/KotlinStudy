package com.jiayx.kotlinstudy.s7

import android.content.Context

/**
 *  author : Jia yu xi
 *  date : 2022/10/18 22:28:28
 *  description :
 */
class SkinManage private constructor(context: Context) {

    companion object : SingletonHolder<SkinManage,Context>(::SkinManage)
}