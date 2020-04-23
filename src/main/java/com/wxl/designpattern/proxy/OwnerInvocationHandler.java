package com.wxl.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by wuxingle on 2020/4/23
 * 用户自己
 */
public class OwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();

        // 自己不能评分
        if (name.equals("setHotOrNotRating")) {
            throw new IllegalAccessException();
        }

        return method.invoke(personBean, args);
    }
}
