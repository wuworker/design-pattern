package com.wxl.designpattern.strategy;

import lombok.Data;

/**
 * Create by wuxingle on 2020/4/16
 * 鸭子类
 */
@Data
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }


    public abstract void display();

}
