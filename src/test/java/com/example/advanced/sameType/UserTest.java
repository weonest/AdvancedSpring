package com.example.advanced.sameType;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

@Slf4j
class UserTest {

    @Test
    public void comparableTest() {

        UserComparable[] users = {
                new UserComparable("엄준식", 12),
                new UserComparable("김영한", 34),
                new UserComparable("원건희", 25),
                new UserComparable("백승한", 25)
        };

        Arrays.sort(users);

        for (UserComparable u : users) {
            log.info("{} {}", u.name, u.age);

        }
    }

    @Test
    public void comparatorTest() {

        UserComparator[] users = {
                new UserComparator("엄준식", 12),
                new UserComparator("김영한", 34),
                new UserComparator("원건희", 25),
                new UserComparator("백승한", 25),
        };

//        Arrays.sort(users, new Comparator<UserComparator>() {
//            @Override
//            public int compare(UserComparator o1, UserComparator o2) {
//                return Integer.compare(o1.age, o2.age);
//            }
//        });

        // 람다
        // Arrays.sort(users, (o1, o2) -> Integer.compare(o1.age, o2.age));
        // 문자열 비교
//         Arrays.sort(users, (o1, o2) -> o1.name.compareTo(o2.name));


         // 정렬 기준이 한 가지 이상인 경우 or 여러 가지로 보고 싶은 경우 / 한 가지도 가능
        Arrays.sort(users, Comparator.comparing(UserComparator::getName));
        for (UserComparator u : users) {
            log.info("{} {}", u.name, u.age);
        }
        System.out.println("\n");

        Arrays.sort(users, Comparator.comparing(UserComparator::getAge));
        for (UserComparator u : users) {
            log.info("{} {}", u.name, u.age);
        }
        System.out.println("\n");

        Arrays.sort(users, Comparator.comparing(UserComparator::getAge)
                .thenComparing(UserComparator::getName));
        for (UserComparator u : users) {
            log.info("{} {}", u.name, u.age);
        }
        System.out.println("\n");
    }

}