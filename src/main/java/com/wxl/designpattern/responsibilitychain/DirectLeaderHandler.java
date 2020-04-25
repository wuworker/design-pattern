package com.wxl.designpattern.responsibilitychain;

/**
 * Create by wuxingle on 2020/4/25
 * 直属领导
 */
public class DirectLeaderHandler extends LeaveHandler {

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() <= 1) {
            System.out.println("直属领导处理完成:" + request.getName());
            return;
        }
        LeaveHandler successor = getSuccessor();
        if (successor != null) {
            System.out.println("直属领导审批进入下个流程");
            successor.handleRequest(request);
        } else {
            System.out.println("直属领导拒绝");
        }
    }
}
