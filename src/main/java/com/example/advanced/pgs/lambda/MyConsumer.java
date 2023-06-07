package com.example.advanced.pgs.lambda;

@FunctionalInterface
public interface MyConsumer<T> {
    void consume(T i);
}
