package com.example;

import java.util.Scanner;

public class Player {

    // 名前
    private String name;

    // trueの場合、これ以上カードをヒットしない
    private boolean noMoreHit;

    // 手札
    private Hands hands;

    public Player(String name) {
        this.name = name;
        this.noMoreHit = false;
        this.hands = new Hands();
    }

    public boolean willHit() {
        if (noMoreHit) {
            return false;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("カードを引きますか？(y/n) =>");
        String answer = scanner.next();
        boolean willHit = answer.equalsIgnoreCase("y");
        if (willHit == false) {
            noMoreHit = true;
        }
        return willHit;
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
