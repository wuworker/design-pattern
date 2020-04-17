package com.wxl.designpattern.observer.pull;

import java.util.Observable;
import java.util.Observer;

/**
 * Create by wuxingle on 2020/4/17
 * 目前状况布告板
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temp;

    private float humidity;

    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.temp = ((WeatherData)o).getTemp();
        this.humidity = ((WeatherData)o).getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("current conditions temp:" + temp + ", humidity:" + humidity);
    }
}
