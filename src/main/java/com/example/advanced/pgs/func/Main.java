package com.example.advanced.pgs.func;

class Greeting implements MySupply {
    @Override
    public String supply() {
        return "Helllllooo";
    }
}

class SayHello implements MyRunnable {
    @Override
    public void run() {
        System.out.println(new Greeting().supply());
    }
}

public class Main {
    public static void main(String[] args) {
        new SayHello().run();
        
        // 인터페이스를 매번 클래스와 함께 선언해서 쓰기 귀찮다
        // 익명클래스가 등장

        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                MySupply s = new MySupply() {
                    @Override
                    public String supply() {
                        return "익명";
                    }
                };
                System.out.println(s.supply());
            }
        };
        r.run();
    }
}
