package com.example;

public class Referee {

    public Result judge(Player player, Dealer dealer) {
        int playerTotal = player.total();
        int dealerTotal = dealer.total();
        boolean playerIsBust = player.isBust();
        boolean dealerIsBust = dealer.isBust();
        // バーストかどうかを判断して勝敗を返す
        if (playerIsBust) {
            return Result.DEALER_WIN;
        } else if (dealerIsBust) {
            return Result.PLAYER_WIN;
        }
        // 得点を比較して勝敗を返す
        if (playerTotal == dealerTotal) {
            return Result.DRAW;
        } else if (playerTotal > dealerTotal) {
            return Result.PLAYER_WIN;
        } else {
            return Result.DEALER_WIN;
        }
    }
}
