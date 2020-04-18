package com.wxl.designpattern.factory.abstractfactory;

/**
 * Create by wuxingle on 2020/4/18
 * 抽象工厂:披萨调料工厂
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Cheese createCheese();

    Sauce createSauce();

}
