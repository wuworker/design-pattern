package com.wxl.designpattern.decorator.impl;

import com.wxl.designpattern.decorator.Beverage;
import com.wxl.designpattern.decorator.CondimentDecorator;

/**
 * Create by wuxingle on 2020/4/17
 * 调料，摩卡
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() +", Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
