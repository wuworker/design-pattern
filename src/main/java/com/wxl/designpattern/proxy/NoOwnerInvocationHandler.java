package com.wxl.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by wuxingle on 2020/4/23
 * 其他人
 */
public class NoOwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public NoOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        // 其他人只能评分
        if (name.startsWith("set") && !name.equals("setHotOrNotRating")) {
            throw new IllegalAccessException();
        }

        return method.invoke(personBean, args);
    }
}
