package com.example.advanced.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void installTest() {

        Field field = new Field();

        for (int i = 0; i < 5; i++) {
            field.render(
                    "가문비나무",
                    Math.random() * Field.fieldSize,
                    Math.random() * Field.fieldSize
            );
        }

        for (int i = 0; i < 5; i++) {
            field.render(
                    "참나무",
                    Math.random() * Field.fieldSize,
                    Math.random() * Field.fieldSize
            );
        }

        for (int i = 0; i < 5; i++) {
            field.render(
                    "소나무",
                    Math.random() * Field.fieldSize,
                    Math.random() * Field.fieldSize
            );
        }

        Memory.print();
    }


}