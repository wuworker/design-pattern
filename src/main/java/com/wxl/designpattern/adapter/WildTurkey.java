package com.wxl.designpattern.adapter;

/**
 * Create by wuxingle on 2020/4/19
 * 野火鸡
 */
public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
