package com.example.advanced.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiInterfaceTest {

    MultiInterface m1 = new MultiInterface();

    @Test
    public void test() {
        m1.styleSame();
    }

}