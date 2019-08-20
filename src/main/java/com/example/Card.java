package com.example;

/**
 * トランプ52枚（13枚×4）を表すEnumです。
 * ブラックジャックでは使わないため、ジョーカーは含んでいません。
 */
public enum Card {
    SPADE_A(Suit.SPADE, Number.ACE),
    SPADE_2(Suit.SPADE, Number.TWO),
    SPADE_3(Suit.SPADE, Number.THREE),
    SPADE_4(Suit.SPADE, Number.FOUR),
    SPADE_5(Suit.SPADE, Number.FIVE),
    SPADE_6(Suit.SPADE, Number.SIX),
    SPADE_7(Suit.SPADE, Number.SEVEN),
    SPADE_8(Suit.SPADE, Number.EIGHT),
    SPADE_9(Suit.SPADE, Number.NINE),
    SPADE_10(Suit.SPADE, Number.TEN),
    SPADE_J(Suit.SPADE, Number.JACK),
    SPADE_Q(Suit.SPADE, Number.QUEEN),
    SPADE_K(Suit.SPADE, Number.KING),
    HEART_A(Suit.HEART, Number.ACE),
    HEART_2(Suit.HEART, Number.TWO),
    HEART_3(Suit.HEART, Number.THREE),
    HEART_4(Suit.HEART, Number.FOUR),
    HEART_5(Suit.HEART, Number.FIVE),
    HEART_6(Suit.HEART, Number.SIX),
    HEART_7(Suit.HEART, Number.SEVEN),
    HEART_8(Suit.HEART, Number.EIGHT),
    HEART_9(Suit.HEART, Number.NINE),
    HEART_10(Suit.HEART, Number.TEN),
    HEART_J(Suit.HEART, Number.JACK),
    HEART_Q(Suit.HEART, Number.QUEEN),
    HEART_K(Suit.HEART, Number.KING),
    DIAMOND_A(Suit.DIAMOND, Number.ACE),
    DIAMOND_2(Suit.DIAMOND, Number.TWO),
    DIAMOND_3(Suit.DIAMOND, Number.THREE),
    DIAMOND_4(Suit.DIAMOND, Number.FOUR),
    DIAMOND_5(Suit.DIAMOND, Number.FIVE),
    DIAMOND_6(Suit.DIAMOND, Number.SIX),
    DIAMOND_7(Suit.DIAMOND, Number.SEVEN),
    DIAMOND_8(Suit.DIAMOND, Number.EIGHT),
    DIAMOND_9(Suit.DIAMOND, Number.NINE),
    DIAMOND_10(Suit.DIAMOND, Number.TEN),
    DIAMOND_J(Suit.DIAMOND, Number.JACK),
    DIAMOND_Q(Suit.DIAMOND, Number.QUEEN),
    DIAMOND_K(Suit.DIAMOND, Number.KING),
    CLUB_A(Suit.CLUB, Number.ACE),
    CLUB_2(Suit.CLUB, Number.TWO),
    CLUB_3(Suit.CLUB, Number.THREE),
    CLUB_4(Suit.CLUB, Number.FOUR),
    CLUB_5(Suit.CLUB, Number.FIVE),
    CLUB_6(Suit.CLUB, Number.SIX),
    CLUB_7(Suit.CLUB, Number.SEVEN),
    CLUB_8(Suit.CLUB, Number.EIGHT),
    CLUB_9(Suit.CLUB, Number.NINE),
    CLUB_10(Suit.CLUB, Number.TEN),
    CLUB_J(Suit.CLUB, Number.JACK),
    CLUB_Q(Suit.CLUB, Number.QUEEN),
    CLUB_K(Suit.CLUB, Number.KING);

    private Suit suit;
    private Number number;

    Card(Suit suit, Number number) {
        this.suit = suit;
        this.number = number;
    }

    public Suit getSuit() {
        return suit;
    }

    public Number getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return suit.getValue() + number.getInitial();
    }
}
