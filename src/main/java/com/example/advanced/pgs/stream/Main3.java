package com.example.advanced.pgs.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {

        // 주사위를 100번 던져서 6이 나올 확률
        Random r = new Random();

//        // generate에는 supplier가 내장
//        var count = Stream.generate(() -> r.nextInt(6) + 1)
//                .limit(100)
//                .filter(i -> i == 6)
//                .count();
//
//        System.out.println(count);


//        int[] arr = Stream.generate(() -> r.nextInt(10) + 1)
//                .distinct()
//                .limit(3)
//                .mapToInt(i -> i)
//                .toArray();
//        System.out.println(Arrays.toString(arr));

        // 0 부터 200 사이의 값을 뽑아 순서대로 표시
        int[] arr = Stream.generate(() -> r.nextInt(200)+1)
                .limit(5)
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(arr));
    }
}
