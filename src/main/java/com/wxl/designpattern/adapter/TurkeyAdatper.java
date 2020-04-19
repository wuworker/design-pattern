package com.wxl.designpattern.adapter;

/**
 * Create by wuxingle on 2020/4/19
 * 火鸡适配器
 */
public class TurkeyAdatper implements Duck {

    private Turkey turkey;

    public TurkeyAdatper(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; i++) {
            turkey.fly();
        }
    }
}
