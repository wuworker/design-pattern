package com.wxl.designpattern.visitor;

/**
 * Create by wuxingle on 2020/4/27
 * 访问者
 */
public interface Visitor {

    void visit(FileElement file);

    void visit(DirElement dir);
}
