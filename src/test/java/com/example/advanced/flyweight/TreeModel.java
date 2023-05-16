package com.example.advanced.flyweight;

public class TreeModel {
    long objSize = 90;

    String type;

    Object leaves;
    Object texture;

    public TreeModel(String type, Object leaves, Object texture) {
        this.type = type;
        this.leaves = leaves;
        this.texture = texture;

        Memory.size += this.objSize;
    }
}
