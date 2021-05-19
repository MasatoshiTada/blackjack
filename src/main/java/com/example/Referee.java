package com.example;

public class Referee {

    public Result judge(Player player, Dealer dealer) {
        // バーストかどうかを判断して勝敗を返す
        if (player.isBust()) {
            return Result.DEALER_WIN;
        } else if (dealer.isBust()) {
            return Result.PLAYER_WIN;
        }
        // 得点を比較して勝敗を返す
        int playerTotal = player.total();
        int dealerTotal = dealer.total();
        if (playerTotal == dealerTotal) {
            return Result.DRAW;
        } else if (playerTotal > dealerTotal) {
            return Result.PLAYER_WIN;
        } else {
            return Result.DEALER_WIN;
        }
    }
}
