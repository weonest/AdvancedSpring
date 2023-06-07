package com.example.advanced.pgs.def3;



class Duck implements Swimmable, Walkable {
}

class Swan implements Flyable, Walkable {
}

public class Main {
    public static void main(String[] args) {
        new Duck().swim();
        new Duck().walk();
        new Swan().fly();
        new Swan().walk();
        Ability.sayHello();
    }
}
