package com.example.advanced.pgs.def2;

public class Main {

    public static void main(String[] args) {


    }
}

class Service implements Myinterface {
    @Override
    public void method1() {
        System.out.println(" ");
    }

    // 지금과 같이 메소드1만 사용하고 싶은데 인터페이스에 2까지 구현되어 있기 때문에
    // method2도 구현을 해야하는 상황이 있음
    // 위와 같이 인터페이스를 확장한 Adaptor 클래스를 상속하여 하나만 구현해서 사용도 가능
    // +
    // 모든 메서드를 default로 구현한 후 필요한 것만 오버라이딩해서 사용도 가능

}