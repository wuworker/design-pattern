package com.wxl.designpattern.factory.abstractfactory.impl;

import com.wxl.designpattern.factory.abstractfactory.Cheese;
import com.wxl.designpattern.factory.abstractfactory.Dough;
import com.wxl.designpattern.factory.abstractfactory.PizzaIngredientFactory;
import com.wxl.designpattern.factory.abstractfactory.Sauce;

/**
 * Create by wuxingle on 2020/4/18
 * 芝加哥风格调味料工厂
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return () -> "Chicago Douth";
    }

    @Override
    public Cheese createCheese() {
        return () -> "Chicago Cheese";
    }

    @Override
    public Sauce createSauce() {
        return () -> "Chicago Sauce";
    }
}
