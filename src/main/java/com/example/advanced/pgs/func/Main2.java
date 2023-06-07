package com.example.advanced.pgs.func;

public class Main2 {
    public static void main(String[] args) {
        new MyRunnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }.run();
            
        
        // 위의 과정에서 뻔한 내용을 다 삭제시킨 것
        MyRunnable r = () -> System.out.println("Hello");

        MyRunnable r2 = () -> {
            MySupply s2 = () -> "헬로 헬로 헬로";
            System.out.println(s2.supply());
        };
        r2.run();

    }
}
