package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 手札のコレクションクラスです。
 */
public class Hands {

    public static final int MAX_TOTAL_VALUE = 21;

    private final List<Card> cardList;

    public Hands() {
        cardList = new ArrayList<>();
    }

    /**
     * カードを手札に加えます。
     * @param card 加えるカード
     */
    public void addHand(Card card) {
        cardList.add(card);
    }

    public String getCardListString() {
        StringBuilder builder = new StringBuilder();
        for (Card card : cardList) {
            builder.append(card);
            builder.append(" ");
        }
        return builder.toString();
    }

    /**
     * 手札の合計値を計算して返します。
     * @return 合計値
     */
    public int calculateTotal() {
        int total = cardList.stream()
                .mapToInt(card -> card.getNumber().getBlackJackValue())
                .sum();

        List<Card> aceList = cardList.stream()
                .filter(this::isAce)
                .collect(Collectors.toList());

        // エースは11として計算しているので、
        // 最大でエースの枚数だけ10を引ける
        for (Card ace : aceList) {
            if (total > MAX_TOTAL_VALUE) {
                total -= ace.getNumber().getBlackJackValue();
                total += ace.getNumber().getAnotherBlackJackValue();
            }
        }

        return total;
    }

    private boolean isAce(Card card) {
        return card.getNumber() == Number.ACE;
    }

}
