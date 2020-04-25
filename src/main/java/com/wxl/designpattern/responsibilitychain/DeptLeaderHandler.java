package com.wxl.designpattern.responsibilitychain;

/**
 * Create by wuxingle on 2020/4/25
 * 部门领导
 */
public class DeptLeaderHandler extends LeaveHandler {

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() <= 3) {
            System.out.println("部门领导处理完成:" + request.getName());
            return;
        }
        LeaveHandler successor = getSuccessor();
        if (successor != null) {
            System.out.println("部门领导审批进入下个流程");
            successor.handleRequest(request);
        } else {
            System.out.println("部门领导拒绝");
        }
    }
}
