package com.wxl.designpattern.bridge;

/**
 * Create by wuxingle on 2020/4/25
 * 小号画笔
 */
public class SmallPen extends Pen {

    @Override
    public void draw(String text) {
        System.out.println(color.name() + "小号画笔:" + text);
    }
}
