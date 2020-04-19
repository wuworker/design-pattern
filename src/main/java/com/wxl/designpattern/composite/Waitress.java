package com.wxl.designpattern.composite;

/**
 * Create by wuxingle on 2020/4/19
 * 服务员
 */
public class Waitress {

    private MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu() {
        menuComponent.print();
    }
}
