package com.example.advanced.pgs.optional;

import com.example.advanced.pgs.collection.User;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        User user = new User(0, "");

        Optional<User> optionalUser = Optional.empty();

        optionalUser = Optional.of(new User(1), "2");

        optionalUser.isEmpty(); // 값이 없으면 True
        optionalUser.isPresent(); // 값이 있으면 True


    }
}
