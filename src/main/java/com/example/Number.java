package com.example;

/**
 * トランプの番号を表すEnumです。
 */
public enum Number {
    ACE(1, "A", 11) {
        @Override
        public int getAnotherBlackJackValue() {
            return 1;
        }
    },
    TWO(2, "2", 2),
    THREE(3, "3", 3),
    FOUR(4, "4", 4),
    FIVE(5, "5", 5),
    SIX(6, "6", 6),
    SEVEN(7, "7", 7),
    EIGHT(8, "8", 8),
    NINE(9, "9", 9),
    TEN(10, "10", 10),
    JACK(11, "J", 10),
    QUEEN(12, "Q", 10),
    KING(13, "K", 10);

    private int value;
    private String initial;
    private int blackJackValue;

    Number(int value, String initial, int blackJackValue) {
        this.value = value;
        this.initial = initial;
        this.blackJackValue = blackJackValue;
    }

    public int getValue() {
        return value;
    }

    public String getInitial() {
        return initial;
    }

    public int getBlackJackValue() {
        return blackJackValue;
    }

    public int getAnotherBlackJackValue() {
        return blackJackValue;
    }
}
