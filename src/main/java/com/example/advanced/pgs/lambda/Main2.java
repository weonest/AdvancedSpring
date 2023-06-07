package com.example.advanced.pgs.lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        new Main2().loop(10, x -> System.out.println(x));
        new Main2().filteredNumbers(30,
                i -> i % 2 == 0,
                System.out::println);
    }

    void loop(int n, MyConsumer<Integer> consumer) {
        for (int i = 0; i < n; i++) {
            consumer.consume(i);
        }
    }

    void filteredNumbers(int max, Predicate<Integer> predicate, Consumer<Integer> consumer) {

        for (int i = 0; i < max; i++)
            if (predicate.test(i)) consumer.accept(i);
    }
}
