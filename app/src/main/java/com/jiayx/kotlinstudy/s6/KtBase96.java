package com.jiayx.kotlinstudy.s6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuxi_
 * on 2022/4/14
 */
class KtBase96 {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<CharSequence>();
        // 泛型默认情况下，泛型父类对象不能赋值给泛型子类对象
        // String 子类 ，CharSequence  父类
        //        List<String> list1 = new ArrayList<CharSequence>();
        // ? super String 相当于 kotlin 的 in
        List<? super String> list2 = new ArrayList<CharSequence>();
    }
}
