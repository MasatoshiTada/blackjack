package com.example;

public class Game {

    private Actor player;

    private Actor dealer;

    private Deck deck;

    private Referee referee;

    public Game() {
        this.player = new Player("プレイヤー");
        this.dealer = new Dealer("ディーラー");
        this.deck = new Deck();
        this.referee = new Referee();
    }

    public void start() {
        System.out.println("ブラックジャックへようこそ！");
        try {
            // 1回目のドロー
            player.drawCard(deck.payOut());
            dealer.drawCard(deck.payOut());
            showCards(player);

            boolean playerWillDraw = true;
            boolean dealerWillDraw = true;

            while (playerWillDraw == true || dealerWillDraw == true) {
                System.out.println("--------------");
                if (playerWillDraw) {
                    playerWillDraw = player.willDraw();
                    if (playerWillDraw) {
                        player.drawCard(deck.payOut());
                        showCards(player);
                    }
                }

                if (dealerWillDraw) {
                    dealerWillDraw = dealer.willDraw();
                    if (dealerWillDraw) {
                        System.out.println("ディーラーがカードを引きました");
                        dealer.drawCard(deck.payOut());
                    }
                }
            }

            System.out.println("--------------");
            showCards(player);
            showCards(dealer);

            showWinner(player, dealer);
        } catch (BustException e) {
            System.out.println("--------------");
            showCards(player);
            showCards(dealer);
            System.out.println(e.getMessage());
        }
    }

    private void showCards(Actor player) {
        System.out.print(player.getName() + "の現在のカード : ");
        for (Card card : player.getCardList()) {
            System.out.print(card + " ");
        }
        System.out.println();
        System.out.println("合計 : " + player.getTotal());
    }

    private void showWinner(Actor player, Actor dealer) {
        Result result = referee.judge(player, dealer);
        switch (result) {
            case DRAW:
                System.out.println("引き分けです。");
                break;
            case PLAYER_WIN:
                System.out.println(player.getName() + "の勝ちです！");
                break;
            default:
                System.out.println(dealer.getName() + "の勝ちです！");
        }
    }
}
