package com.example;

public class Dealer {

    // 名前
    private String name;

    // 手札
    private Hands hands;

    public Dealer(String name) {
        this.name = name;
        this.hands = new Hands();
    }

    /**
     * ディーラーは合計値17を下回ってはならない
     */
    private static final int WILL_HIT_IF_TOTAL_IS_LESS_THAN = 17;

    public boolean willHit() {
        return total() < WILL_HIT_IF_TOTAL_IS_LESS_THAN;
    }

    public void hit(Card card) {
        hands.addHand(card);
    }

    public boolean isBust() {
        int score = hands.total();
        return score > Hands.BUST_IF_TOTAL_IS_OVER;
    }

    public String getName() {
        return name;
    }

    public int total() {
        return hands.total();
    }

    @Override
    public String toString() {
        String text = name + "の現在のカード : " + hands.toString() + "\n"
                + "合計 : " + total();
        if (isBust()) {
            text += "(バースト)";
        }
        return text;
    }
}
