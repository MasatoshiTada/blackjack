package com.example;

public class Game {

    private Player player;

    private Dealer dealer;

    private Deck deck;

    private Referee referee;

    public Game(Player player, Dealer dealer, Deck deck, Referee referee) {
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
        this.referee = referee;
    }

    public void start() {
        System.out.println("ブラックジャックへようこそ！");
        try {
            // 1回目のヒット
            player.hit(deck.payOut());
            dealer.hit(deck.payOut());
            // 2回目のヒット
            player.hit(deck.payOut());
            dealer.hit(deck.payOut());
            System.out.println(player);

            boolean playerWillHit = true;
            boolean dealerWillHit = true;

            while (playerWillHit == true || dealerWillHit == true) {
                System.out.println("--------------");
                if (playerWillHit) {
                    playerWillHit = player.willHit();
                    if (playerWillHit) {
                        player.hit(deck.payOut());
                        System.out.println(player);
                    }
                }

                if (dealerWillHit) {
                    dealerWillHit = dealer.willHit();
                    if (dealerWillHit) {
                        System.out.println("ディーラーがカードを引きました");
                        dealer.hit(deck.payOut());
                    }
                }
            }

            System.out.println("--------------");
            System.out.println(player);
            System.out.println(dealer);

            showWinner(player, dealer);
        } catch (BustException e) {
            System.out.println("--------------");
            System.out.println(player);
            System.out.println(dealer);
            System.out.println(e.getMessage());
        }
    }

    private void showWinner(Player player, Dealer dealer) {
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
