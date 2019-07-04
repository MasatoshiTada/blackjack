package com.example;

public enum Suit {

    SPADE("♠"), HEART("♥"), DIAMOND("♦"), CLUB("♣");

    private String value;

    Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
