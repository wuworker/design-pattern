package com.wxl.designpattern.decorator.impl;

import com.wxl.designpattern.decorator.Beverage;

/**
 * Create by wuxingle on 2020/4/17
 * 饮料
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        desc="HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
