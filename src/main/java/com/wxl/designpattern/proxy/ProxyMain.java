package com.wxl.designpattern.proxy;

import java.lang.reflect.Proxy;

/**
 * Create by wuxingle on 2020/4/23
 * 代理模式
 */
public class ProxyMain {

    public static void main(String[] args) {
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName("wxl");
        personBean.setInterests("java");

        PersonBean owner = PersonBean.getOwner(personBean);
        owner.setInterests("bowing go");
        try {
            owner.setHotOrNotRating(5);
        } catch (Exception e) {
            System.out.println("own setHotOrNotRating:" + e.getCause().getClass().getSimpleName());
        }

        System.out.println(owner);

        PersonBean noOwner = PersonBean.getNoOwner(personBean);
        noOwner.setHotOrNotRating(10);

        System.out.println(noOwner);

        System.out.println(Proxy.isProxyClass(owner.getClass()));
        System.out.println(Proxy.isProxyClass(noOwner.getClass()));
    }
}
