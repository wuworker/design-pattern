package com.wxl.designpattern.observer.push.impl;

import com.wxl.designpattern.observer.push.DisplayElement;
import com.wxl.designpattern.observer.push.Observer;
import com.wxl.designpattern.observer.push.Subject;

/**
 * Create by wuxingle on 2020/4/16
 * 统计布告板
 */
public class StatisticDisplay implements Observer, DisplayElement {

    private float temp;

    private float humidity;

    private float pressure;

    private Subject subject;

    public StatisticDisplay(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }


    @Override
    public void display() {
        System.out.println("max statistic temp:" + temp + ", humidity:" + humidity + ", pressure:" + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (temp > this.temp) {
            this.temp = temp;
        }
        if (humidity > this.humidity) {
            this.humidity = humidity;
        }
        if (pressure > this.pressure) {
            this.pressure = pressure;
        }
        display();
    }
}
