package com.wxl.designpattern.strategy.impl;

import com.wxl.designpattern.strategy.QuackBehavior;

/**
 * Create by wuxingle on 2020/4/16
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
