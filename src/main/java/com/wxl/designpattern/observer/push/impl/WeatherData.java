package com.wxl.designpattern.observer.push.impl;

import com.wxl.designpattern.observer.push.Observer;
import com.wxl.designpattern.observer.push.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by wuxingle on 2020/4/16
 * 气象站
 */
public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private float temp;

    private float humidity;

    private float pressure;

    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 数据变化
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }
}
