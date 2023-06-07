package com.example.advanced.pgs;

// 인터페이스는 모든 메소드가 추상메서드로 구현
// 따라서 구현부가 없어야 함 (중괄호가 없어야 함)

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService(new KakaoLogin());
        userService.login();

    }

}
