package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
