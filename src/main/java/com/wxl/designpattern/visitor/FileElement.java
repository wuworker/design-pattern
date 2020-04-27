package com.wxl.designpattern.visitor;

import lombok.Data;

/**
 * Create by wuxingle on 2020/4/27
 * file
 */
@Data
public class FileElement implements Element {

    private String name;

    private int size;

    public FileElement(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
