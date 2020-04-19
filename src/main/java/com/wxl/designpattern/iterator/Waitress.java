package com.wxl.designpattern.iterator;

import java.util.Iterator;

/**
 * Create by wuxingle on 2020/4/19
 * 服务员
 */
public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu;

    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("-----breakfast--------");
        printMenu(pancakeHouseMenu.menuIterator());
        System.out.println("-----dinner---------");
        printMenu(dinerMenu.menuIterator());
    }

    private void printMenu(Iterator<MenuItem> it) {
        while (it.hasNext()) {
            MenuItem next = it.next();
            System.out.println(next);
        }
    }
}
