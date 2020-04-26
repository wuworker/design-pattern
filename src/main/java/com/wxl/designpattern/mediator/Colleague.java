package com.wxl.designpattern.mediator;

/**
 * Create by wuxingle on 2020/4/26
 * 同事
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
