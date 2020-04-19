package com.wxl.designpattern.templatemethod;

/**
 * Create by wuxingle on 2020/4/19
 * 模版方法模式
 */
public class TemplateMethodMain {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea.........");
        tea.prepareRecipe();
        System.out.println("Making coffee...........");
        coffee.prepareRecipe();
    }

}
