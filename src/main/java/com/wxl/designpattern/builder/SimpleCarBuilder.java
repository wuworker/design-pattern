package com.wxl.designpattern.builder;

/**
 * Create by wuxingle on 2020/4/25
 * 汽车builder
 */
public class SimpleCarBuilder implements CarBuilder {

    private Car car = new Car();

    @Override
    public CarBuilder setWheel(String wheel) {
        car.setWheel(wheel);
        return this;
    }

    @Override
    public CarBuilder setFrame(String frame) {
        car.setFrame(frame);
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setWidget(String widget) {
        car.setWidget(widget);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
