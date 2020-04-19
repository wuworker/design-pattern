package com.wxl.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create by wuxingle on 2020/4/19
 * Pancake菜单
 */
public class PancakeHouseMenu implements Menu {

    private List<MenuItem> menus = new ArrayList<>();

    public PancakeHouseMenu() {

        addItem("KB's Pancake Breadfast", "has egg", 2.99);
        addItem("Regular Pancake Breadfast", "has toast", 2.19);
        addItem("Pancake Blueberry", "blue blueberries", 3.99);
    }

    public void addItem(String name, String desc, double price) {
        menus.add(new MenuItem(name, desc, price));
    }

    @Override
    public Iterator<MenuItem> menuIterator() {
        return menus.iterator();
    }
}
