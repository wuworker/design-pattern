package com.wxl.designpattern.decorator.impl;

import com.wxl.designpattern.decorator.Beverage;
import com.wxl.designpattern.decorator.CondimentDecorator;

/**
 * Create by wuxingle on 2020/4/17
 * 调料，大豆
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
