package com.example.advanced.pgs.collection;

public class User {

    public static User EMPTY = new User(0, "");
    private int age;
    private String name;

    @Override
    public String toString() {
        return name + "{ " + age + " }";
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // getter 로 다 공개하는 것보다는 다음과 같이 메소드 내에서 처리
    public boolean isOver19() {
        return age >= 19;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
}
