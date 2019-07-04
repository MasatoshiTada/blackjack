package com.example;

public class Referee {

    public Result judge(Actor player, Actor dealer) {
        int playerDiff = calculateDiff(player.getTotal());
        int dealerDiff = calculateDiff(dealer.getTotal());
        if (playerDiff == dealerDiff) {
            return Result.DRAW;
        } else if (playerDiff < dealerDiff) {
            return Result.PLAYER_WIN;
        } else {
            return Result.DEALER_WIN;
        }
    }

    private int calculateDiff(int total) {
        return Constants.MAX_TOTAL_VALUE - total;
    }
}
