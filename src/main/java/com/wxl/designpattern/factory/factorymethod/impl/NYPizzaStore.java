package com.wxl.designpattern.factory.factorymethod.impl;

import com.wxl.designpattern.factory.factorymethod.Pizza;
import com.wxl.designpattern.factory.factorymethod.PizzaStore;

/**
 * Create by wuxingle on 2020/4/18
 * 纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYCheesePizza();
        }
        return new NYVeggiePizza();
    }
}
