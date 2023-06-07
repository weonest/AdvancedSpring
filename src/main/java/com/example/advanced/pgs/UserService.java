package com.example.advanced.pgs;

public class UserService implements Login {
    
    // Login에 의존한다
    private Login login;
    
    // 의존성을 외부에 맡김으로써 유연성을 갖춘다
    // 인터페이스를 의존하기 때문에 얕은 결합
    // 의존성 주입, Dependency Injection
    // Dependency Inversion 의존 역전
    public UserService(Login login) {
        this.login = login;
    }

    @Override
    public void login() {
        login.login();
    }
}
