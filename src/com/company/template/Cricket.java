package com.company.template;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("cricked initialized");
    }

    @Override
    void startPlay() {
        System.out.println("cricket started");
    }

    @Override
    void endPlay() {
        System.out.println("cricet ended");
    }
}
