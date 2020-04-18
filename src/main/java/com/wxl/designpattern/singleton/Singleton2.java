package com.wxl.designpattern.singleton;

/**
 * Create by wuxingle on 2020/4/18
 * 通过静态内部类实现懒加载
 */
public class Singleton2 {

    private Singleton2() {
    }

    private static class Holder {
        private static Singleton2 singleton2 = new Singleton2();
    }


    public static Singleton2 getInstance() {
        return Holder.singleton2;
    }
}
