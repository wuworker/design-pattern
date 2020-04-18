package com.wxl.designpattern.factory.abstractfactory.impl;

import com.wxl.designpattern.factory.abstractfactory.Pizza;
import com.wxl.designpattern.factory.abstractfactory.PizzaIngredientFactory;

/**
 * Create by wuxingle on 2020/4/18
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("-----prepare-------:" + getName());
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
