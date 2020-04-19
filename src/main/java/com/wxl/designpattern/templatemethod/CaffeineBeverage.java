package com.wxl.designpattern.templatemethod;

/**
 * Create by wuxingle on 2020/4/19
 * 冲泡方法
 */
public abstract class CaffeineBeverage {

    /**
     * 准备配方
     */
    public final void prepareRecipe(){
        boilWater();

        brew();

        pourInCup();

        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
