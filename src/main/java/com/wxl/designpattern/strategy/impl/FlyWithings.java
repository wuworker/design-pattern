package com.wxl.designpattern.strategy.impl;

import com.wxl.designpattern.strategy.FlyBehavior;

/**
 * Create by wuxingle on 2020/4/16
 */
public class FlyWithings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
