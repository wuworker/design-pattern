package com.wxl.designpattern.observer.pull;

import lombok.Getter;

import java.util.Observable;

/**
 * Create by wuxingle on 2020/4/17
 * 气象站
 */
@Getter
public class WeatherData extends Observable {

    private float temp;

    private float humidity;

    private float pressure;

    public void measurementsChanged() {
        setChanged();
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

}
