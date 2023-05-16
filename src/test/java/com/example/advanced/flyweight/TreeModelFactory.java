package com.example.advanced.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeModelFactory {

    private static final Map<String, TreeModel> cache = new HashMap<>();

    public static TreeModel getInstance(String key) {

        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            TreeModel model = new TreeModel(
                    key,
                    new Object(),
                    new Object()
            );
        System.out.println("-- 새로운 나무 객체 생성 완료 --");

        cache.put(key, model);

        return model;
        }
    }
}
