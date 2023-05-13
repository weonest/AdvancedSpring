package com.example.advanced.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void noProxyTest() {
        Subject realSubject = new RealSubject();
        Subject cacheProxy = new CacheProxy(realSubject);
        Subject MessageDecorator = new MessageDecorator(cacheProxy);
        ProxyPatternClient client = new ProxyPatternClient(MessageDecorator);
        client.execute();
    }
}