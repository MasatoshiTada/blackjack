package com.example;

import java.util.List;

/**
 *
 */
public interface Actor {

    /**
     * カードを1枚引きます。
     * @param card 引いたカード
     * @throws BustException 合計が21を超えた場合
     */
    void hit(Card card) throws BustException;

    /**
     * プレイヤーの名前を返します。
     * @return プレイヤーの名前
     */
    String getName();

    /**
     * 保持しているカードのリストを返します。
     * @return カードのリスト
     */
    Hands getHands();

    /**
     * ブラックジャックにおけるカードの合計値を返します。
     * @return カードの合計値
     */
    int getTotal();

    /**
     * カードを更に1枚引く場合はtrueを返します。
     * @return カードを更に1枚引く場合はtrue、そうでない場合はfalse
     */
    boolean willHit();
}
