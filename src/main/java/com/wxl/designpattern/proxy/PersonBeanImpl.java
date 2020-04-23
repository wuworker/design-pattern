package com.wxl.designpattern.proxy;

import lombok.ToString;

/**
 * Create by wuxingle on 2020/4/23
 */
@ToString
public class PersonBeanImpl implements PersonBean {

    private String name;

    private String interests;

    private int rating;

    private int ratingCount;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
