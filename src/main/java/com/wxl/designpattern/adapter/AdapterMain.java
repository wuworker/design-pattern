package com.wxl.designpattern.adapter;

/**
 * Create by wuxingle on 2020/4/19
 * 适配器模式
 */
public class AdapterMain {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyDuck = new TurkeyAdatper(turkey);

        duck.quack();
        duck.fly();

        turkeyDuck.quack();
        turkeyDuck.fly();

    }
}
