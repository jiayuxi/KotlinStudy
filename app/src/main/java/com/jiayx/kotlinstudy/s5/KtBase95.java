package com.jiayx.kotlinstudy.s5;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/**
 * Created by yuxi_
 * on 2022/4/14
 */
class KtBase95 {

    public static void main(String[] args) {
//        List<CharSequence> list = new ArrayList<String>();
        // 泛型默认情况下，泛型子类对象不能赋值给泛型父类对象
        // CharSequence  父类 ，String 子类
        //        List<CharSequence> list1 = new ArrayList<String>();
        // ? extends CharSequence 相当于 kotlin 的 out
        List<? extends CharSequence> list2 = new ArrayList<String>();
    }
}
