package com.example.advanced.pgs.collection;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        new MyCollection<>(
                Arrays.asList(
                        new User(10, "aaa"),
                        new User(11, "bbb"),
                        new User(14, "ccc"),
                        new User(17, "ddd"),
                        new User(23, "eee"),
                        new User(25, "fff"),
                        new User(27, "ggg")
                )
        )
                .filter(User::isOver19)
                .foreach(System.out::println);
                // getter 적용 자제
//                .filter(u -> u.getAge() >= 19)
//                .map(u -> u.getName())
//                .foreach(System.out::println);
    }
}
