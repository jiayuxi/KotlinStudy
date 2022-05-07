package com.jiayx.kotlinstudy.s8;

import java.io.IOException;

/**
 * Created by yuxi_
 * on 2022/4/18
 */
class KtBaseThrow {
    public static void main(String[] args) {
        try {
            new KtBaseThrow().extendException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void extendException() throws IOException{
        throw new IOException();
    }
}
