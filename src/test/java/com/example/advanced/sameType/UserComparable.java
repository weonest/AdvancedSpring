package com.example.advanced.sameType;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
public class UserComparable implements Comparable<UserComparable> {

    String name;
    int age;

    public UserComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(UserComparable user) {

        if (this.age < user.age) {
            return -1;
        } else if (this.age == user.age) {
            return 0;
        } else {
            return 1;
        }
    }

//    @Test
//    public void test() {
//
//        UserComparable[] users = {
//                new UserComparable("엄준식", 12),
//                new UserComparable("원건희", 25),
//                new UserComparable("백승한", 25),
//                new UserComparable("김영한", 34)
//        };
//
//        Arrays.sort(users);
//
//        for (UserComparable u : users) {
//            log.info("{} {}", u.name, u.age);
//
//        }
//    }

}
