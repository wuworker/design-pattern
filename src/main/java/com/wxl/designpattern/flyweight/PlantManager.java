package com.wxl.designpattern.flyweight;

import java.util.Random;

/**
 * Create by wuxingle on 2020/4/25
 * 蝇量管理对象
 */
public class PlantManager {

    private int size;

    private PlantFactory plantFactory;

    private int[] x, y, age, type;

    public PlantManager(int size) {
        this.size = size;
        this.plantFactory = new PlantFactory();
        this.x = new int[size];
        this.y = new int[size];
        this.age = new int[size];
        this.type = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            x[i] = random.nextInt(size * 10);
            y[i] = random.nextInt(size * 10);
            age[i] = random.nextInt(1000);
            type[i] = random.nextInt(2);
        }
    }


    public void displayPlant() {
        for (int i = 0; i < size; i++) {
            PlantFactory.Type t = type[i] == 0 ? PlantFactory.Type.TREE : PlantFactory.Type.GRASS;
            plantFactory.getPlant(t).display(x[i], y[i], age[i]);
        }
    }
}
