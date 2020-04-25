package com.wxl.designpattern.responsibilitychain;

/**
 * Create by wuxingle on 2020/4/25
 * 责任链模式
 */
public class ResponsibilityChainMain {

    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("XiaoMing",5);

        LeaveHandler directHandler = new DirectLeaderHandler();
        LeaveHandler deptHandler = new DeptLeaderHandler();
        LeaveHandler gManagerHandler = new GManagerHandler();

        directHandler.setSuccessor(deptHandler);
        deptHandler.setSuccessor(gManagerHandler);

        directHandler.handleRequest(request);
    }
}
