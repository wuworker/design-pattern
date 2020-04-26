package com.wxl.designpattern.mediator;

/**
 * Create by wuxingle on 2020/4/26
 * 同事2
 */
public class Colleague2 extends Colleague {

    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    public void receiveMessage(String message) {
        System.out.println("colleague2收到消息: " + message);
    }

    // 同事类之间不能直接交互, 同事类不能完成的工作委托给中介者完成
    public void sendMessageToColleague1(String message) {
        super.mediator.sendMessageToColleague1(message);
    }
}
