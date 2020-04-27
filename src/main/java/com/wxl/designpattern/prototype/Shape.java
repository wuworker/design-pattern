package com.wxl.designpattern.prototype;

/**
 * Create by wuxingle on 2020/4/27
 * 形状
 */
public abstract class Shape implements Cloneable {

    private String id;

    private String type;

    public Shape(String id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }
}
