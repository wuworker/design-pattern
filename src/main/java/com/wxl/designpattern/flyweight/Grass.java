package com.wxl.designpattern.flyweight;

/**
 * Create by wuxingle on 2020/4/25
 * 草
 */
public class Grass extends Plant {

    @Override
    public void display(int x, int y, int age) {
        System.out.println(age + " years grass display on (" + x + "," + y + ")");
    }
}
