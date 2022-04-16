package com.jiayx.kotlinstudy.s6

/**
 *Created by yuxi_
on 2022/4/16
todo kotlin 语言 单例模式 静态内部类
 */
class SingletonObject05 {
    // 背后代码实现的逻辑
    /*
    * public final class SingletonObject05Kt{
    *  @NotNull
    *  private static final SingletonObject05 instance;
    *  public static final SingletonObject05.Companion Companion = new SingletonObject05.Companion((DefaultConstructorMarker)null)
    *
    *  static {
    *   instance = SingletonObject05.SingletonHelp.INSTANCE.getHelp();
    *  }
    *
    *  private static final SingletonHelp{
    *  @NotNull
    *  private static final SingletonObject05 help;
    *
    *   @NotNull
    *   public static final SingletonObject05.SingletonHelp INSTANCE ;
    *
    *    @NotNull
    *    public SingletonObject05 getHelp(){
    *     return help;
    *   }
    *   static {
    *     SingletonObject05.SingletonHelp var0 = new SingletonObject05.SingletonHelp();
    *     INSTANCE = var0;
    *     help = new SingletonObject05();
    *   }
    *
    * }
    *  public static final Companion{
    *    @NotNull
    *    public final SingletonObject05 getInstance(){
    *      return SingletonObject05.instance;
    *   }
    *   private Companion(){}
    *   public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
    *  }
    * }
    * */
    companion object {
        val instance = SingletonHelp.help
    }

    private object SingletonHelp {
        val help = SingletonObject05()
    }

    fun method(str: String) {
        println(str)
    }
}

fun main() {
    SingletonObject05.instance.method("单例模式-静态内部类")
}