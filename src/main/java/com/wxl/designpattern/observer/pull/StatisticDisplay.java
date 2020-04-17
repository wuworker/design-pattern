package com.wxl.designpattern.observer.pull;

import java.util.Observable;
import java.util.Observer;

/**
 * Create by wuxingle on 2020/4/17
 * 统计布告板
 */
public class StatisticDisplay implements Observer, DisplayElement {

    private float temp;

    private float humidity;

    private float pressure;

    private Observable observable;

    public StatisticDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("max statistic temp:" + temp + ", humidity:" + humidity + ", pressure:" + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData data = (WeatherData) o;
        if (data.getTemp() > this.temp) {
            this.temp = data.getTemp();
        }
        if (data.getHumidity() > this.humidity) {
            this.humidity = data.getHumidity();
        }
        if (data.getPressure() > this.pressure) {
            this.pressure = data.getPressure();
        }
        display();
    }
}
