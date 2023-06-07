package com.example.advanced.pgs.def;


interface MyInterface {
    void method();
    default void defMethod(){
        System.out.println("디폴트 메서드");
    }

}


public class Main implements MyInterface{
    @Override
    public void method() {

    }

    @Override
    // 디폴트 메서드를 오버라이드 하여 변경해서 사용도 가능
    public void defMethod() {
//        MyInterface.super.defMethod();
        System.out.println("디뽈트 오버라이드");
    }

    public static void main(String[] args) {
        new Main().defMethod();
    }
}
