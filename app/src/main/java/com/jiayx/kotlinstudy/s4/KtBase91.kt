package com.jiayx.kotlinstudy.s4

/**
 *Created by yuxi_
on 2022/4/13
todo kotlin 语言的接口定义
 */
interface IUSB {
    var usbVersionInfo: String //usb 版本相关的信息
    var usbInsertDevice: String //USB插入的设备信息

    fun insertUSB(): String
}

// 鼠标usb 类的实现
class Mouse(
    override var usbVersionInfo: String = "USB3.0",
    override var usbInsertDevice: String = "鼠标接入了USB接口"
) : IUSB {
    override fun insertUSB(): String = "鼠标：$usbVersionInfo,$usbInsertDevice"
}

// 接盘接入
class KeyBoard : IUSB {
    override var usbVersionInfo: String = "USB3.1"
        get() = field
        set(value) {
            field = value
        }
    override var usbInsertDevice: String = "接盘接入了USB接口"
        get() {
            println("@你get了[$field]值出去")
            return field
        }
        set(value) {
            field = value
            println("@你set了[$value]值进来")
        }

    override fun insertUSB(): String = "键盘：$usbVersionInfo,$usbInsertDevice"
}
//1、接口里面所有的成员 和接口本身 都是 public open ，所以不需要 open,这个是接口的特殊
//2、接口不能有主构造，反正没有构造函数
//3、实现类不仅仅要重写接口的函数 也要重写接口的成员
//4、接口实现代码区域，全部都要增加 override 关键字
fun main() {
    val mouse = Mouse()
    println(mouse.insertUSB())

    val keyboard: IUSB = KeyBoard()
    println(keyboard.insertUSB())
    keyboard.usbInsertDevice = "BBBBB"
    println(keyboard.insertUSB())
}