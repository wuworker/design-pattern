package com.wxl.designpattern.composite;

/**
 * Create by wuxingle on 2020/4/19
 * 菜单项
 *
 */
public abstract class MenuComponent {


    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }


    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDesc() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

}
