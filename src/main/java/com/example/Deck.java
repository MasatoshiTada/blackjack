package com.example;

/**
 * ディーラーが持つカードデッキです。
 */
public interface Deck {

    /**
     * デッキからカードを払い出します。
     * @return 払い出されたカード
     */
    Card payOut();
}
