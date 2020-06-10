package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * ディーラーが持つカードデッキです。
 */
public class Deck {

    private final List<Card> cardList;

    public Deck() {
        Card[] cards = Card.values();
        List<Card> cardList = new LinkedList<>(Arrays.asList(cards));
        Collections.shuffle(cardList);
        this.cardList = cardList;
    }

    /**
     * デッキからカードを払い出します。
     * @return 払い出されたカード
     */
    public Card payOut() {
        return cardList.remove(0);
    }
}
