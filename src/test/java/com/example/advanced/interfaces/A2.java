package com.example.advanced.interfaces;

interface A2{
    public void styleA();

    // C1 클래스와 메소드 시그니처가 같은 디폴트 메서드
    default public void styleSame() {
        System.out.println("A2 인터페이스의 디폴트 메서드 입니다.");
    }
}

abstract class C1 {
    // A1 인터페이스와 메소드 시그니처가 같은 인스턴스 메서드
    public void styleSame() {
        System.out.println("C1 클래스의 인스턴스 메서드 입니다.");
    }
}

// 메서드 시그니처가 같은 두 추상화들을 동시에 상속
class MultiClassInterface extends C1 implements A2 {
    @Override
    public void styleA() {}

    public void print() {
        A2.super.styleSame(); // 슈퍼호출
    }
}

