package com.example.advanced.pgs.lambda;

@FunctionalInterface
public interface MyMapper<I, O> {

    O map(I s);
}
