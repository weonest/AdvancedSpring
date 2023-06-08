package com.example.advanced.pgs.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
//        MyCollection<String> c1 = new MyCollection<>(Arrays.asList("A12", "B4", "C", "D"));
//
//        MyCollection<Integer> c2 = c1.map(s -> s.length());
//        c2.foreach(System.out::println);

        // 메소드 체이닝 방식 -> . . .으로 계속 이어지는 형태
        int s = new MyCollection<>(Arrays.asList("A12", "B4", "C", "D"))
                .map(String::length)
                .filter(i -> i % 2 == 1)
                .size();
        System.out.println(s);
    }
}