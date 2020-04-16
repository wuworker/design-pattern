package com.wxl.designpattern.strategy;

import com.wxl.designpattern.strategy.impl.FlayNoWay;
import com.wxl.designpattern.strategy.impl.Quack;

/**
 * Create by wuxingle on 2020/4/16
 * 模型鸭
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlayNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
