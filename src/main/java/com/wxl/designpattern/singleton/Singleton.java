package com.wxl.designpattern.singleton;

/**
 * Create by wuxingle on 2020/4/18
 * 单例模式,懒加载
 * volatile禁止指令重排序
 * new一个对象存在几个步骤，其中分为调用构造函数，返回地址引用。
 * 可能重排序后先返回的引用，然后再构造对象
 * a线程执行到new，但指令被重排序后，这时b线程拿到引用发现不为空，就直接使用了，但对象还没初始化完成
 */
public class Singleton {

    private volatile static Singleton singleton;


    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
