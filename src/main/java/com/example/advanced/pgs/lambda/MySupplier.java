package com.example.advanced.pgs.lambda;

@FunctionalInterface
public interface MySupplier<T> {
    T supply();
}
