package com.wxl.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by wuxingle on 2020/4/25
 * 植物工厂
 */
public class PlantFactory {

    enum Type {
        TREE, GRASS
    }

    private Map<Type, Plant> map = new HashMap<>();


    public Plant getPlant(Type type) {
        if (!map.containsKey(type)) {
            switch (type) {
                case TREE:
                    map.put(type, new Tree());
                    break;
                case GRASS:
                    map.put(type, new Grass());
                    break;
                default:
                    break;

            }
        }
        return map.get(type);
    }

}
