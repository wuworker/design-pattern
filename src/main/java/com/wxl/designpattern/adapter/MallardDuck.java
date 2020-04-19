package com.wxl.designpattern.adapter;

/**
 * Create by wuxingle on 2020/4/19
 * 绿头鸭
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
