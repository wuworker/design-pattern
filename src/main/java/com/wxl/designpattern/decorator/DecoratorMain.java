package com.wxl.designpattern.decorator;

import com.wxl.designpattern.decorator.impl.Espresso;
import com.wxl.designpattern.decorator.impl.HouseBlend;
import com.wxl.designpattern.decorator.impl.Mocha;
import com.wxl.designpattern.decorator.impl.Soy;

/**
 * Create by wuxingle on 2020/4/17
 * 装饰者模式
 */
public class DecoratorMain {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDesc() + " $ " + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);

        System.out.println(houseBlend.getDesc() + " $ " + houseBlend.cost());
    }
}
