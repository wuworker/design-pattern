package com.wxl.designpattern.state;

import lombok.Data;

/**
 * Create by wuxingle on 2020/4/22
 * 糖果机
 */
@Data
public class GumballMachine {


    private State soldOutState;

    private State soldState;

    private State hasQuarterState;

    private State noQuarterState;

    private State winnerState;


    private State state;

    private int count;

    public GumballMachine(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        state = noQuarterState;
    }

    /**
     * 投入25分钱
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /**
     * 退回25分钱
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 旋转曲柄
     */
    public void tumCrank() {
        state.tumCrank();
        state.dispense();
    }

    public void releaseBall() {
        count--;
    }

    public void refill(int count) {
        this.count = this.count + count;
        if (state == soldOutState) {
            state = noQuarterState;
        }
    }
}
