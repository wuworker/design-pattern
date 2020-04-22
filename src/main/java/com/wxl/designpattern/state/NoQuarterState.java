package com.wxl.designpattern.state;

/**
 * Create by wuxingle on 2020/4/22
 * 没有25分钱状态
 */
public class NoQuarterState implements State {

    private GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    /**
     * 投入25分钱
     */
    @Override
    public void insertQuarter() {
        System.out.println("You insert quarter!");
        machine.setState(machine.getHasQuarterState());
    }

    /**
     * 退回25分钱
     */
    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert quarter!");
    }

    /**
     * 旋转曲柄
     */
    @Override
    public void tumCrank() {
        System.out.println("You tum,but no quarter!");
    }

    /**
     * 分发糖果
     */
    @Override
    public void dispense() {
        System.out.println("You need pay first!");
    }
}
