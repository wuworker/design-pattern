package com.wxl.designpattern.factory.factorymethod.impl;

import com.wxl.designpattern.factory.factorymethod.Pizza;
import com.wxl.designpattern.factory.factorymethod.PizzaStore;

/**
 * Create by wuxingle on 2020/4/18
 * 芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoCheesePizza();
        }
        return new ChicagoVeggiePizza();
    }
}
