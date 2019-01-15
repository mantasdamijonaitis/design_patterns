package com.company.template;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football game initialized");
    }

    @Override
    void startPlay() {
        System.out.printf("football game started");
    }

    @Override
    void endPlay() {
        System.out.println("football game ended");
    }
}
