package com.wxl.designpattern.responsibilitychain;

/**
 * Create by wuxingle on 2020/4/25
 * 总经理
 */
public class GManagerHandler extends LeaveHandler {

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() <= 30) {
            System.out.println("总经理处理完成:" + request.getName());
            return;
        }
        LeaveHandler successor = getSuccessor();
        if (successor != null) {
            successor.handleRequest(request);
        } else {
            System.out.println("总经理拒绝");
        }
    }
}
