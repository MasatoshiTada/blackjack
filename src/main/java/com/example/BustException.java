package com.example;

public class BustException extends Exception {

    public BustException(String playerName) {
        super(playerName + "がバーストしました");
    }
}
