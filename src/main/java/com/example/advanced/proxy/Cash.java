package com.example.advanced.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cash implements Payment {


    @Override
    public void pay(int amount) {
        log.info("{}원 현금 결제", amount);
        System.out.println(amount + "원 현금 결제");
    }
}
