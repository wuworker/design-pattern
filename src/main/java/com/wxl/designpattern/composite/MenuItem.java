package com.wxl.designpattern.composite;

/**
 * Create by wuxingle on 2020/4/19
 * 菜单项，叶子节点
 */
public class MenuItem extends MenuComponent {

    private String name;

    private String desc;

    private double price;

    public MenuItem(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
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
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        System.out.println(", " + getPrice());
        System.out.println("    --" + getDesc());
    }

}
