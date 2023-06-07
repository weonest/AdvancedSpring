package com.example.advanced.pgs.lambda;

public class Main {
    public static void main(String[] args) {

        // 제네릭도 활용할 수 있따
        MySupplier<String> s = () -> "hello world";
        MyMapper<String, Integer> m = String::length; // 인자를 받으면 바로 돌리기
        MyConsumer<Integer> c = System.out::println; // 인자를 받으면 바로 돌리기
        MyConsumer<Integer> c2 = i -> System.out.println(i * 10);
        MyRunnable r = () -> c.consume(m.map(s.supply()));

        r.run();
    }
}
