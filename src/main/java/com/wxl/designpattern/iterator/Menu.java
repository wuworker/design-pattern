package com.wxl.designpattern.iterator;

import java.util.Iterator;

/**
 * Create by wuxingle on 2020/4/19
 * 菜单
 */
public interface Menu {

    Iterator<MenuItem> menuIterator();
}
