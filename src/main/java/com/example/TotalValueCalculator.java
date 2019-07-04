package com.example;

import java.util.List;

public class TotalValueCalculator {

    public int calculateTotal(List<Card> cardList) {
        int total = 0;
        int aceCount = 0;

        for (Card card : cardList) {
            if (isAce(card)) {
                aceCount++;
            }
            total += card.getNumber().getBlackJackValue();
        }

        // エースは11として計算しているので、
        // 最大でエースの枚数だけ10を引ける
        for (int i = 0; i < aceCount; i++) {
            if (total > Constants.MAX_TOTAL_VALUE) {
                total -= 10;
            }
        }

        return total;
    }

    private boolean isAce(Card card) {
        return card.getNumber() == Number.ACE;
    }
}
