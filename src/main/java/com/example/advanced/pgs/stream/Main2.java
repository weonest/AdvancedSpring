package com.example.advanced.pgs.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream<Integer> s = Arrays.asList(1, 2, 3).stream();

        // 원시 타입에 대한 Stream도 있다.
//        IntStream s2 =
        Arrays.stream(new int[]{1, 2, 3})
                .map(Integer::valueOf);

        Arrays.stream(new int[]{1, 2, 3})
                .boxed();

        Arrays.stream(new int[]{1, 2, 3})
                .boxed()
                .collect(Collectors.toList());

        Arrays.stream(new int[]{1, 2, 3})
                .boxed()
                .toArray(Integer[]::new); // 여기서 타입을 지정해주지 않으면 Object로 생성된다

        // Stream을 만드는 방법 두 가지 generate, iterate
        // Stream은 데이터의 연속이기 때문에 다음과 같이 만들 경우
        // 1을 계속해서 생성해낸다
//        Stream.generate(() -> 1)
//                .forEach(System.out::println);

        // 제한하고 싶은 경우
        Random r = new Random();
        Stream.generate(r::nextDouble)
                .limit(10) // 생성 제한
                .forEach(System.out::println);

        // 인자가 두 개가 들어옴
        // 1. 시드값
        // 2. 시드값을 어떻게 변경할 함수
        Stream.iterate(0, (i) -> i + 1)
                .limit(10)
                .forEach(System.out::println);
    }
}
