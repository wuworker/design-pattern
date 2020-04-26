package com.wxl.designpattern.mediator;

/**
 * Create by wuxingle on 2020/4/26
 * 中介者模式
 */
public class MediatorMain {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Colleague1 colleague1 = new Colleague1(mediator);
        Colleague2 colleague2 = new Colleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.sendMessageToColleague2("hello");
        colleague2.sendMessageToColleague1("hi");
    }
}
