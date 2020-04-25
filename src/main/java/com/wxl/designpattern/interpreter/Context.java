package com.wxl.designpattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by wuxingle on 2020/4/25
 * 解释器上下文
 * 保存变量和值
 */
public class Context {

    private Map<String, Integer> map = new HashMap<>();


    public void put(String var, Integer value) {
        map.put(var, value);
    }

    public Integer get(String var) {
        return map.get(var);
    }
}
