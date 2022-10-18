package com.jiayx.kotlinstudy.s7

/**
 *  author : Jia yu xi
 *  date : 2022/10/18 22:21:21
 *  description :
 *  把创建和初始化带有参数的单例的逻辑封装起来。
 *  并通过双重检查锁定算法实现逻辑的线程安全。
 */
open class SingletonHolder<out T, in A>(creator: (A) -> T) {
    private var creator: ((A) -> T)? = creator

    @Volatile
    private var instance: T? = null

    fun getInstance(args: A): T {
        val i = instance
        if (i != null) return i
        return synchronized(this) {
            val i2 = instance
            if (i2 != null) {
                i2
            } else {
                val created = creator!!(args)
                instance = created
                creator = null
                created
            }
        }
    }

    /**
     * 上述方法的一种更简洁的写法
     */
    fun getInstance2(args: A): T = instance ?: synchronized(this) {
        instance ?: creator!!(args).apply {
            instance = this
        }
    }
}