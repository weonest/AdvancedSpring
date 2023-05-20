package com.example.advanced.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarineTest {

    Unit m = new Marine();

    @Test
    public void test() {

        m.move(5, 7);
        System.out.println("m.x = " + m.x);
    }

}