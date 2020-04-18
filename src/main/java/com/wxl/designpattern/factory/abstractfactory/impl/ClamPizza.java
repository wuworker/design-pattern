package com.wxl.designpattern.factory.abstractfactory.impl;

import com.wxl.designpattern.factory.abstractfactory.Pizza;
import com.wxl.designpattern.factory.abstractfactory.PizzaIngredientFactory;

/**
 * Create by wuxingle on 2020/4/18
 * clam披萨
 */
public class ClamPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("Clam Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("-----prepare-------:" + getName());
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
