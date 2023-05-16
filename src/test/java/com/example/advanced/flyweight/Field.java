package com.example.advanced.flyweight;


import lombok.extern.slf4j.Slf4j;

// 팩토리를 사용할 클라이언트
@Slf4j
public class Field {

    static final int fieldSize = 10000;

    public void render(String type,double x, double y) {
        TreeModel model = TreeModelFactory.getInstance(type);

        Tree tree = new Tree(model, x, y);

        log.info("{}, {} 위치에 {} 나무 생성 완료", x, y, type);

    }
}
