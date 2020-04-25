package com.wxl.designpattern.bridge;

/**
 * Create by wuxingle on 2020/4/25
 * 抽象
 * 画笔
 */
public abstract class Pen {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(String text);
}
