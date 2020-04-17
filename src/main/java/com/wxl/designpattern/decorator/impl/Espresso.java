package com.wxl.designpattern.decorator.impl;

import com.wxl.designpattern.decorator.Beverage;

/**
 * Create by wuxingle on 2020/4/17
 * 饮料，咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        desc = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
