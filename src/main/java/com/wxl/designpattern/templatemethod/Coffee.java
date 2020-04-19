package com.wxl.designpattern.templatemethod;

/**
 * Create by wuxingle on 2020/4/19
 * 咖啡
 */
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dipping coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
