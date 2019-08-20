package com.example;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("プレイヤー");
        Dealer dealer = new Dealer("ディーラー");
        Deck deck = new ShuffledDeck();
        Referee referee = new Referee();

        Game game = new Game(player, dealer, deck, referee);
        game.start();
    }
}
