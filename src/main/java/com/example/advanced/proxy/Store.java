package com.example.advanced.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Store {
    Payment payment;

    public Store(Payment payment) {
        this.payment = payment;
    }

    public void buySomething(int amount) {
        payment.pay(amount);
    }
}
