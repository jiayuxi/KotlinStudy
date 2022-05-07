package com.jiayx.kotlinstudy.s5

/**
 *Created by yuxi_
on 2022/4/13
 */
data class KtBase90(var name:String) {}
// todo 数据类使用的场景
// 条件一：服务器请求返回的响应，JavaBean，LoginResponseBean 基本都可以使用
// 条件二：数据类型至少必须有一个参数的主构造函数
// 条件三：数据类型必须有参数，var ,val 的参数
// 条件四：数据类型不能使用 abstract，open ,sealed,inner 等等修(数据类，数据载入的事情，数据存储)
// 条件五：需求 比较，copy，toString,解构 等等 这些丰富的功能时，也可以使用数据类