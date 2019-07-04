package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cardList;

    public Deck() {
        Card[] cards = Card.values();
        ArrayList<Card> cardList = new ArrayList<>(Arrays.asList(cards));
        Collections.shuffle(cardList);
        this.cardList = cardList;
    }

    public Card payOut() {
        return cardList.remove(cardList.size() - 1);
    }
}
