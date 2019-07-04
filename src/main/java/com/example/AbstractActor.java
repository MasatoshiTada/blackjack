package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractActor implements Actor {

    private String name;

    private List<Card> cardList;

    private TotalValueCalculator calculator;

    protected AbstractActor(String name) {
        this.name = name;
        this.cardList = new ArrayList<>();
        this.calculator = new TotalValueCalculator();
    }

    @Override
    public void drawCard(Card card) throws BustException {
        cardList.add(card);
        if (isBust()) {
            throw new BustException(name);
        }
    }

    private boolean isBust() {
        int score = calculator.calculateTotal(cardList);
        return score > Constants.MAX_TOTAL_VALUE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Card> getCardList() {
        return Collections.unmodifiableList(cardList);
    }

    @Override
    public int getTotal() {
        return calculator.calculateTotal(cardList);
    }
}
