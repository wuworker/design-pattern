package com.wxl.designpattern.observer.push;

/**
 * Create by wuxingle on 2020/4/16
 * 观察者
 */
public interface Observer {

    /**
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);
}
