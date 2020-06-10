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
    private static final int WILL_HIT_THRESHOLD = 17;

    public boolean willHit() {
        return calculateTotal() < WILL_HIT_THRESHOLD;
    }

    public void hit(Card card) {
        hands.addHand(card);
    }

    public boolean isBust() {
        int score = hands.calculateTotal();
        return score > Hands.MAX_TOTAL_VALUE;
    }

    public String getName() {
        return name;
    }

    public int calculateTotal() {
        return hands.calculateTotal();
    }

    @Override
    public String toString() {
        String text = name + "の現在のカード : " + hands.getCardListString() + "\n"
                + "合計 : " + calculateTotal();
        if (isBust()) {
            text += "(バースト)";
        }
        return text;
    }
}
