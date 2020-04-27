package com.wxl.designpattern.visitor;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create by wuxingle on 2020/4/27
 * dir
 */
public class DirElement implements Element, Iterable<Element> {

    @Setter
    @Getter
    private String name;

    private List<Element> list;

    public DirElement(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void addElement(Element element) {
        list.add(element);
    }

    @Override
    public Iterator<Element> iterator() {
        return list.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
