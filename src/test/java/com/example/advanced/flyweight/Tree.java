package com.example.advanced.flyweight;

public class Tree {

    private TreeModel model;
    long objSize = 10; // 10MB

    double position_x;
    double position_y;

    public Tree(TreeModel model,  double position_x, double position_y) {
        this.model = model;
        this.position_x = position_x;
        this.position_y = position_y;

        // 메모리 사이즈 증가시키기
        Memory.size += this.objSize;
    }
}
