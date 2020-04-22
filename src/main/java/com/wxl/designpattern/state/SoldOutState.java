package com.wxl.designpattern.state;

/**
 * Create by wuxingle on 2020/4/22
 * 售完状态
 */
public class SoldOutState implements State {

    private GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    /**
     * 投入25分钱
     */
    @Override
    public void insertQuarter() {
        System.out.println("Can't insert quarter!");
    }

    /**
     * 退回25分钱
     */
    @Override
    public void ejectQuarter() {
        System.out.println("No Money!");
    }

    /**
     * 旋转曲柄
     */
    @Override
    public void tumCrank() {
        System.out.println("You turned, but not gumball!");
    }

    /**
     * 分发糖果
     */
    @Override
    public void dispense() {
        System.out.println("Gumball sold out!");
    }
}
