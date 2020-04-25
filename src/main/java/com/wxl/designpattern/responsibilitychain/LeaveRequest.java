package com.wxl.designpattern.responsibilitychain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Create by wuxingle on 2020/4/25
 * 请假请求
 */
@Data
@AllArgsConstructor
public class LeaveRequest {

    private String name;

    private int days;
}
