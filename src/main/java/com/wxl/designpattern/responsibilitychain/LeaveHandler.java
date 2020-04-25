package com.wxl.designpattern.responsibilitychain;

/**
 * Create by wuxingle on 2020/4/25
 * handler
 */
public abstract class LeaveHandler {

    private LeaveHandler successor;

    public LeaveHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(LeaveHandler successor) {
        this.successor = successor;
    }


    public abstract void handleRequest(LeaveRequest request);
}
