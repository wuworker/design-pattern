package com.wxl.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create by wuxingle on 2020/4/19
 * 菜单,非叶子结点
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menus = new ArrayList<>();

    private String name;

    private String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(MenuComponent component) {
        menus.add(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menus.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDesc());
        System.out.println("---------------------------------");

        Iterator<MenuComponent> it = menus.iterator();
        while (it.hasNext()) {
            it.next().print();
        }
    }
}
