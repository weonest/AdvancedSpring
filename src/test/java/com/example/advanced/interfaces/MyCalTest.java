package com.example.advanced.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalTest {
    MyCal mc = new MyCal();

    @Test
    public void test() {
        int a = mc.multiple(5, 10);
        int b = mc.plus(5, 10);
        int c = mc.sub(5, 10);

        System.out.println(a + " " + b + " " + c);
        // 업캐스팅 접근
        Calculator cal = (Calculator) mc;
        int d = cal.sub(2, 3);
        System.out.println("d = " + d);
    }
}