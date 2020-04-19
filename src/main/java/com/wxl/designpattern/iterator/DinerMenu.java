package com.wxl.designpattern.iterator;

import java.util.Iterator;

/**
 * Create by wuxingle on 2020/4/19
 * 晚餐菜单
 */
public class DinerMenu implements Menu {

    private static final int MAX_SIZE = 6;

    private int index;

    private MenuItem[] menus = new MenuItem[6];

    public DinerMenu() {
        addItem("Vegetarian BLT ", "has tomato", 2.99);
        addItem("BLT ", "little tomato", 1.99);
        addItem("Soup of Day", "has salad", 3.99);

    }

    public void addItem(String name, String desc, double price) {
        if (index >= MAX_SIZE) {
            throw new IllegalStateException("can't add Item");
        }
        menus[index++] = new MenuItem(name, desc, price);
    }

    @Override
    public Iterator<MenuItem> menuIterator() {
        return new MenuIterator();
    }

    private class MenuIterator implements Iterator<MenuItem> {

        private int position = 0;


        @Override
        public boolean hasNext() {
            return position < index;
        }

        @Override
        public MenuItem next() {
            return menus[position++];
        }
    }
}
