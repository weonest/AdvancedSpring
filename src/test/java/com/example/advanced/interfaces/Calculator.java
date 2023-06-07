package com.example.advanced.interfaces;

public interface Calculator {
    int plus(int i, int j);

    int multiple(int i, int j);

    default int sub(int i, int j) {
        return i - j;
    }
}

class MyCal implements Calculator {

    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int multiple(int i, int j) {
        return i * j;
    }
}
