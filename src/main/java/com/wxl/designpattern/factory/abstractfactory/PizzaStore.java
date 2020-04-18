package com.wxl.designpattern.factory.abstractfactory;


/**
 * Create by wuxingle on 2020/4/18
 * 工厂:披萨店
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


    public abstract Pizza createPizza(String type);
}
