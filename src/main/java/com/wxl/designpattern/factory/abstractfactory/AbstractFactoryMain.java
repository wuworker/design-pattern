package com.wxl.designpattern.factory.abstractfactory;

import com.wxl.designpattern.factory.abstractfactory.impl.ChicagoPizzaStore;
import com.wxl.designpattern.factory.abstractfactory.impl.NYPizzaStore;

/**
 * Create by wuxingle on 2020/4/18
 * 抽象工厂模式
 * Pizza和PizzaStore使用了工厂方法模式
 * Pizza实现类和PizzaIngredientFactory使用了抽象工厂
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyPizzaStore.orderPizza("cheese");
        System.out.println("get pizza:" + pizza1);

        Pizza pizza2 = chicagoPizzaStore.orderPizza("clam");
        System.out.println("get pizza:" + pizza2);
    }
}
