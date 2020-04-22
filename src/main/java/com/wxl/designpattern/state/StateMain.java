package com.wxl.designpattern.state;

/**
 * Create by wuxingle on 2020/4/22
 * 状态模式
 * state也可以设计为抽象类，提取公共的代码
 * state类也可以在多个GumballMachine实例中共享
 * GumballMachine也可以控制状态的转换
 */
public class StateMain {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);

        for (int i = 0; i < 5; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.tumCrank();

            System.out.println("-------------");
        }

    }
}
