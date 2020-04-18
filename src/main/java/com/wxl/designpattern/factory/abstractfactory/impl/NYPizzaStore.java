package com.wxl.designpattern.factory.abstractfactory.impl;

import com.wxl.designpattern.factory.abstractfactory.Pizza;
import com.wxl.designpattern.factory.abstractfactory.PizzaIngredientFactory;
import com.wxl.designpattern.factory.abstractfactory.PizzaStore;

/**
 * Create by wuxingle on 2020/4/18
 * 纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            return new CheesePizza(ingredientFactory);
        }

        return new ClamPizza(ingredientFactory);
    }
}
