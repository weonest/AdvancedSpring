package com.example.advanced.pgs.def3;

public interface Flyable {
    default void fly() {
        System.out.println("날기");
    };
}

interface Ability {
    static void sayHello() {
        System.out.println("하이");
    }
}

interface Swimmable {
    default void swim() {
        System.out.println("수영");
    };
}

interface Walkable {
    default void walk() {
        System.out.println("걷기");
    };
}