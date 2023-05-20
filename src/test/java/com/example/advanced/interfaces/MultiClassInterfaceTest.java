package com.example.advanced.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiClassInterfaceTest {

    MultiClassInterface m2 = new MultiClassInterface();

    @Test
    public void test() {
        m2.styleSame();

        //타입 캐스팅해도 클래스 인스턴스 메서드 호출
        ((A2)m2).styleSame();

        // 슈허호출
        m2.print();
    }

}