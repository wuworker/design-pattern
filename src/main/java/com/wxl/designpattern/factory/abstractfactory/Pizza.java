package com.wxl.designpattern.factory.abstractfactory;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by wuxingle on 2020/4/18
 * 披萨，产品
 */
public abstract class Pizza {

    @Getter
    @Setter
    private String name;

    protected Dough dough;

    protected Cheese cheese;

    protected Sauce sauce;


    public abstract void prepare();


    public void bake() {
        System.out.println("--------bake---------");
    }

    public void cut() {
        System.out.println("--------cut---------");
    }

    public void box() {
        System.out.println("--------box---------");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" use ingredient:");
        if (dough != null) {
            sb.append(dough.name()).append(",");
        }
        if (cheese != null) {
            sb.append(cheese.name()).append(",");
        }
        if (sauce != null) {
            sb.append(sauce.name()).append(",");
        }
        return sb.toString();
    }
}
