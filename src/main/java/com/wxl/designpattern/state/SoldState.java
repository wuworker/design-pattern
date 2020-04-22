package com.wxl.designpattern.state;

/**
 * Create by wuxingle on 2020/4/22
 * 出售状态
 */
public class SoldState implements State {

    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    /**
     * 投入25分钱
     */
    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we already giving you a gumball!");
    }

    /**
     * 退回25分钱
     */
    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,you already turn crank!");
    }

    /**
     * 旋转曲柄
     */
    @Override
    public void tumCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    /**
     * 分发糖果
     */
    @Override
    public void dispense() {
        System.out.println("A gumball sold out");
        machine.releaseBall();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState());
        } else {
            System.out.println("Out of gumballs!");
            machine.setState(machine.getSoldOutState());
        }
    }
}
