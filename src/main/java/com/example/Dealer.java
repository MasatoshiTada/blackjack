package com.example;

public class Dealer extends AbstractActor {

    /**
     * ディーラーは合計値17を下回ってはならない
     */
    private static final int WILL_DRAW_MORE_CARD_THRESHOLD = 17;

    public Dealer(String name) {
        super(name);
    }

    @Override
    public boolean willHit() {
        return getTotal() <= WILL_DRAW_MORE_CARD_THRESHOLD;
    }
}
