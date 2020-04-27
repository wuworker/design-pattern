package com.wxl.designpattern.visitor;

/**
 * Create by wuxingle on 2020/4/27
 * 数据结构
 */
public interface Element {

    void accept(Visitor visitor);
}
