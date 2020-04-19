package com.wxl.designpattern.iterator;

import lombok.Getter;
import lombok.ToString;

/**
 * Create by wuxingle on 2020/4/19
 * 菜单项
 */
@Getter
@ToString
public class MenuItem {

    private String name;

    private String desc;

    private double price;

    public MenuItem(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }
}
