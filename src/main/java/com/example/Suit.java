package com.example;

/**
 * トランプのマークを表すEnumです。
 */
public enum Suit {

    SPADE("♠"), HEART("♥"), DIAMOND("♦"), CLUB("♣");

    private final String value;

    Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
