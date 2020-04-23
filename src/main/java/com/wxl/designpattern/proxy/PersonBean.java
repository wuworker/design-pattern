package com.wxl.designpattern.proxy;

import java.lang.reflect.Proxy;

/**
 * Create by wuxingle on 2020/4/23
 */
public interface PersonBean {

    String getName();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);


    static PersonBean getOwner(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(PersonBean.class.getClassLoader(),
                new Class[]{PersonBean.class}, new OwnerInvocationHandler(personBean));
    }


    static PersonBean getNoOwner(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(PersonBean.class.getClassLoader(),
                new Class[]{PersonBean.class}, new NoOwnerInvocationHandler(personBean));
    }
}
