package com.example;

public class Dealer extends AbstractActor {

    private static final int WILL_DRAW_MORE_CARD_THRESHOLD = 17;

    public Dealer(String name) {
        super(name);
    }

    @Override
    public boolean willDraw() {
        return getTotal() <= WILL_DRAW_MORE_CARD_THRESHOLD;
    }
}
