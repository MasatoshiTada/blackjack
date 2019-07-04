package com.example;

import java.util.List;

public interface Actor {

    void drawCard(Card card) throws BustException;

    String getName();

    List<Card> getCardList();

    int getTotal();

    boolean willDraw();
}
