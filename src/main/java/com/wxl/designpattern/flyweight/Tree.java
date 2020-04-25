package com.wxl.designpattern.flyweight;

/**
 * Create by wuxingle on 2020/4/25
 * 树
 */
public class Tree extends Plant {

    @Override
    public void display(int x, int y, int age) {
        System.out.println(age + " years tree display on (" + x + "," + y + ")");
    }
}
