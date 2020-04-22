package com.wxl.designpattern.state;

import java.util.Random;

/**
 * Create by wuxingle on 2020/4/22
 * 没有钱的状态
 */
public class HasQuarterState implements State {

    private Random random = new Random();

    private GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    /**
     * 投入25分钱
     */
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter!");
    }

    /**
     * 退回25分钱
     */
    @Override
    public void ejectQuarter() {
        System.out.println("Quarter return!");
        machine.setState(machine.getNoQuarterState());
    }

    /**
     * 旋转曲柄
     */
    @Override
    public void tumCrank() {
        System.out.println("You turned...");
        if (random.nextInt(10) == 5 && machine.getCount() > 1) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }
    }

    /**
     * 分发糖果
     */
    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }
}
