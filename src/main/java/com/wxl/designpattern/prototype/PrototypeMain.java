package com.wxl.designpattern.prototype;

/**
 * Create by wuxingle on 2020/4/27
 * 原型模式
 */
public class PrototypeMain {

    private static Shape rectangleCache = new Rectangle("1");

    private static Shape circleCache = new Circle("2");

    public static void main(String[] args) {
        Circle circle1 = getCircle();
        Circle circle2 = getCircle();
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle1 == circle2);

        Rectangle rectangle1 = getRectangle();
        Rectangle rectangle2 = getRectangle();
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle1 == rectangle2);
    }


    public static Rectangle getRectangle() {
        return (Rectangle) rectangleCache.clone();
    }

    public static Circle getCircle() {
        return (Circle) circleCache.clone();

    }
}
