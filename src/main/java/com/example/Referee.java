package com.example;

public class Referee {

    public Result judge(Player player, Dealer dealer) {
        int playerTotal = player.calculateTotal();
        int dealerTotal = dealer.calculateTotal();
        boolean playerIsBust = player.isBust();
        boolean dealerIsBust = dealer.isBust();
        // バーストかどうかを判断して勝敗を返す
        if (playerIsBust && dealerIsBust) {
            return Result.DEALER_WIN;
        } else if (playerIsBust) {
            return Result.DEALER_WIN;
        } else if (dealerIsBust) {
            return Result.PLAYER_WIN;
        }
        // 21点との差を計算して勝敗を返す
        int playerDiff = calculateDiff(playerTotal);
        int dealerDiff = calculateDiff(dealerTotal);
        if (playerDiff == dealerDiff) {
            return Result.DRAW;
        } else if (playerDiff < dealerDiff) {
            return Result.PLAYER_WIN;
        } else {
            return Result.DEALER_WIN;
        }
    }

    private int calculateDiff(int total) {
        return Hands.MAX_TOTAL_VALUE - total;
    }
}
