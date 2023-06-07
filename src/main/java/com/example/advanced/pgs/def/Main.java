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
    public void defMethod() {
        MyInterface.super.defMethod();
    }

    public static void main(String[] args) {
        new Main().defMethod();
    }
}
