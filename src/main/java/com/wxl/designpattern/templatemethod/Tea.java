package com.wxl.designpattern.templatemethod;

/**
 * Create by wuxingle on 2020/4/19
 * 茶
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
