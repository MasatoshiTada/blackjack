package com.example;

public class Game {

    private final Player player;

    private final Dealer dealer;

    private final Deck deck;

    private final Referee referee;

    public Game(Player player, Dealer dealer, Deck deck, Referee referee) {
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
        this.referee = referee;
    }

    public void start() {
        System.out.println("ブラックジャックへようこそ！");
        // 1回目のヒット
        player.hit(deck.payOut());
        dealer.hit(deck.payOut());
        // 2回目のヒット
        player.hit(deck.payOut());
        dealer.hit(deck.payOut());
        System.out.println(player);

        while (true) {
            System.out.println("--------------");
            // プレイヤーがカードを引くか意思決定する
            boolean playerWillHit = player.willHit();
            if (playerWillHit) {
                // プレイヤーがカードを引く
                player.hit(deck.payOut());
                System.out.println(player);
            }

            // ディーラーがカードを引くか意思決定する
            boolean dealerWillHit = dealer.willHit();
            if (dealerWillHit) {
                // ディーラーがカードを引く
                dealer.hit(deck.payOut());
                System.out.println("ディーラーがカードを引きました");
            }

            // プレイヤーとディーラーの両方がこれ以上カードをヒットしない、
            // またはどちらかがバーストしたら繰り返しを終了する
            if (playerWillHit == false && dealerWillHit == false
                    || player.isBust() || dealer.isBust()) {
                break;
            }
        }

        System.out.println("--------------");
        System.out.println(player);
        System.out.println(dealer);

        showResult(player, dealer);
    }

    private void showResult(Player player, Dealer dealer) {
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
