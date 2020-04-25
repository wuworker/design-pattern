package com.wxl.designpattern.flyweight;

/**
 * Create by wuxingle on 2020/4/25
 * 蝇量模式
 */
public class FlyweightMain {

    public static void main(String[] args) {
        PlantManager plantManager = new PlantManager(100);

        plantManager.displayPlant();
    }
}
