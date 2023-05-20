package com.example.advanced.interfaces;

interface A1{
    public void styleA();

    // 메소드 시그니처가 같은 디폴트 메서드
    default public void styleSame(){
        System.out.println("A1 인터페이스의 디폴트 메서드 입니다.");
    }
}

interface B1{
    public void styleB();

    // 메소드 시그니처가 같은 디폴트 메서드
    default public void styleSame(){
        System.out.println("B1 인터페이스의 디폴트 메서드 입니다.");
    }
}

class MultiInterface implements A1, B1 {
    @Override
    public void styleA() {}
    @Override
    public void styleB() {}

    // 두 인터페이스 디폴트 메서드중 A1 인터페이스의 디폴트 메서드를 오버라이딩 하여 구현

    @Override
    public void styleSame(){
        System.out.println("A1 인터페이스의 디폴트 메서드 입니다.");
    }
}


