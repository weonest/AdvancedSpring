package com.example.advanced.interfaces;

public abstract class Unit {
    int x;
    int y;

    abstract void move(int x, int y);
}

class Marine extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
