package com.wxl.designpattern.state;

/**
 * Create by wuxingle on 2020/4/22
 * 状态
 */
public interface State {

    /**
     * 投入25分钱
     */
    void insertQuarter();

    /**
     * 退回25分钱
     */
    void ejectQuarter();

    /**
     * 旋转曲柄
     */
    void tumCrank();

    /**
     * 分发糖果
     */
    void dispense();
}
