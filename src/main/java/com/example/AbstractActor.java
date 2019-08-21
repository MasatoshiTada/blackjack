package com.example;

public abstract class AbstractActor implements Actor {

    private String name;

    private Hands hands;

    protected AbstractActor(String name) {
        this.name = name;
        this.hands = new Hands();
    }

    @Override
    public void hit(Card card) throws BustException {
        hands.addHand(card);
        if (isBust()) {
            throw new BustException(this);
        }
    }

    private boolean isBust() {
        int score = hands.calculateTotal();
        return score > Hands.MAX_TOTAL_VALUE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int calculateTotal() {
        return hands.calculateTotal();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append("の現在のカード : ");
        builder.append(hands.getCardListString());
        builder.append("\n");
        builder.append("合計 : ");
        builder.append(calculateTotal());
        return builder.toString();
    }
}
