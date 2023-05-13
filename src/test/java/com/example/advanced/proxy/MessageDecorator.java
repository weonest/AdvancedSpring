package com.example.advanced.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements Subject {
    private Subject subject;

    public MessageDecorator(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator 실행");
        String result = subject.operation();
        String decoResult = " ***** " + result + " ***** ";
        log.info("MessageDecorator 꾸미기 적용 전={}, 적용 후={}", result, decoResult);
        return decoResult;
    }
}
