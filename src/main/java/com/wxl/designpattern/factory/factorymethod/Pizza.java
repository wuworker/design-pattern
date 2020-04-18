package com.wxl.designpattern.factory.factorymethod;

/**
 * Create by wuxingle on 2020/4/18
 * 产品:披萨
 */
public abstract class Pizza {

    protected String name;


    public void prepare() {
        System.out.println("-------prepare:" + name + "------");
    }


    public void bake() {
        System.out.println("------bake------");
    }

    public void cut() {
        System.out.println("------cut------");
    }

    public void box() {
        System.out.println("------box------");
    }

    public String getName() {
        return name;
    }
}
