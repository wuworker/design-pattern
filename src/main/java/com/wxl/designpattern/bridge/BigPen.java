package com.wxl.designpattern.bridge;

/**
 * Create by wuxingle on 2020/4/25
 * 大号画笔
 */
public class BigPen extends Pen {

    @Override
    public void draw(String text) {
        System.out.println(color.name() + "大号画笔:" + text);
    }
}
