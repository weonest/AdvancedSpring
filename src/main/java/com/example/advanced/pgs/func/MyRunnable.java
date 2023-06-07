package com.example.advanced.pgs.func;

@FunctionalInterface
public interface MyRunnable {
    void run(); // 추상 메서드가 하나밖에 없는 메서드 == 함수형 인터페이스
}

@FunctionalInterface
interface MyMap {
    void map(); // 디폴트와 스태틱 메서드가 있음에도 추상메서드가 하나뿐이기 때문에 함수형 인터페이스다
    default void say() {
        System.out.println("Hi");

    }
    static void sayBye() {
        System.out.println("Bye");
        
    }
}