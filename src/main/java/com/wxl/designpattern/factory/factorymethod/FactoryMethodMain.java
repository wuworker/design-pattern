package com.wxl.designpattern.factory.factorymethod;

import com.wxl.designpattern.factory.factorymethod.impl.ChicagoPizzaStore;
import com.wxl.designpattern.factory.factorymethod.impl.NYPizzaStore;

/**
 * Create by wuxingle on 2020/4/18
 * 工厂方法模式
 * 产品和工厂是平行的类层级
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyPizzaStore.orderPizza("cheese");
        System.out.println("get pizza:" + pizza1.getName());

        Pizza pizza2 = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("get pizza:" + pizza2.getName());
    }
}
