package com.example;

/**
 * バーストした際にスローされる例外です。
 */
public class BustException extends Exception {

    public BustException(Actor actor) {
        super(actor.getName() + "がバーストしました");
    }
}
