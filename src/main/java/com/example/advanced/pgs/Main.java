package com.example.advanced.pgs;

// 인터페이스는 모든 메소드가 추상메서드로 구현
// 따라서 구현부가 없어야 함 (중괄호가 없어야 함)

public class Main {

    public static void main(String[] args) {
        // 설정파일에 의해 동작하도록 할 수 있다
        
        new Main().run(LoginType.Naver);

    }

    public void run(LoginType type) {
        // 타입을 Login으로 함으로써 얕은 결합도를 지니게 된다
        Login user = getLogin(type);
        user.login();
    }

    //factory 패턴
    private Login getLogin(LoginType type) {
        if (type == LoginType.Kakao) return new KakaoLogin();
        return new NaverLogin();
    }


}
