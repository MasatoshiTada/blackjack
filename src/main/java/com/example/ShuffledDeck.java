package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ディーラーが持つカードデッキです。
 */
public class ShuffledDeck implements Deck {

    private final List<Card> cardList;

    public ShuffledDeck() {
        Card[] cards = Card.values();
        ArrayList<Card> cardList = new ArrayList<>(Arrays.asList(cards));
        Collections.shuffle(cardList);
        this.cardList = cardList;
    }

    /**
     * デッキからカードを払い出します。
     * @return 払い出されたカード
     */
    public Card payOut() {
        return cardList.remove(cardList.size() - 1);
    }
}
