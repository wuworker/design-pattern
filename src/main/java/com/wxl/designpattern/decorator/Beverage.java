package com.wxl.designpattern.decorator;

/**
 * Create by wuxingle on 2020/4/17
 * 饮料，装饰者的component
 */
public abstract class Beverage {

    protected String desc = "Unknown Beverage";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();
}
