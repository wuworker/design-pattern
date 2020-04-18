package com.wxl.designpattern.factory.abstractfactory.impl;

import com.wxl.designpattern.factory.abstractfactory.Cheese;
import com.wxl.designpattern.factory.abstractfactory.Dough;
import com.wxl.designpattern.factory.abstractfactory.PizzaIngredientFactory;
import com.wxl.designpattern.factory.abstractfactory.Sauce;

/**
 * Create by wuxingle on 2020/4/18
 * 纽约风格调味料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return () -> "New York Douth";
    }

    @Override
    public Cheese createCheese() {
        return () -> "New York Cheese";
    }

    @Override
    public Sauce createSauce() {
        return () -> "New York Sauce";
    }
}
