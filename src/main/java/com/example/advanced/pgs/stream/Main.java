package com.example.advanced.pgs.stream;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.asList("a", "Ab", "ABC", "ABCD", "ABCD")
                .stream()
                .map(s -> s.length())
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

    }
}
