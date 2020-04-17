package com.wxl.designpattern.observer.push.impl;

import com.wxl.designpattern.observer.push.DisplayElement;
import com.wxl.designpattern.observer.push.Observer;
import com.wxl.designpattern.observer.push.Subject;

/**
 * Create by wuxingle on 2020/4/16
 * 目前状况布告板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;

    private float humidity;

    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void display() {
        System.out.println("current conditions temp:" + temp + ", humidity:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
