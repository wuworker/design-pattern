package com.wxl.designpattern.iterator;

/**
 * Create by wuxingle on 2020/4/19
 * 迭代器模式
 */
public class IteratorMain {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
