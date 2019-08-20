package com.example;

import java.util.Scanner;

public class Player extends AbstractActor {

    public Player(String name) {
        super(name);
    }

    @Override
    public boolean willHit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("カードを引きますか？(y/n) =>");
        String answer = scanner.next();
        boolean willHit = answer.equalsIgnoreCase("y");
        return willHit;
    }
}
