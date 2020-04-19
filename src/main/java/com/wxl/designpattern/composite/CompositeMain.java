package com.wxl.designpattern.composite;

/**
 * Create by wuxingle on 2020/4/19
 * 组合模式
 * MenuComponent同时处理了叶子节点和非叶子节点
 * 牺牲了单一职责，换取了透明性，即Waitress类不用管是Menu还是MenuItem
 */
public class CompositeMain {

    public static void main(String[] args) {
        MenuComponent allMenu = new Menu("ALL MENU", "ALL MENU COMBINED");

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinnerMenu);
        allMenu.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("KB's Pancake Breadfast", "has egg", 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breadfast", "has toast", 2.19));
        pancakeHouseMenu.add(new MenuItem("Pancake Blueberry", "blue blueberries", 3.99));

        dinnerMenu.add(new MenuItem("Pasta", "a slice of bread", 3.89));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "has ice cream", 1.59));

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
    }
}