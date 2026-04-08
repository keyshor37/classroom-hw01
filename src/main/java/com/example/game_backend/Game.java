package com.example.game_backend;

public class Game {
    private final int secretNumber;
    private int attempts;

    public Game(int secretNumber) {
        this.secretNumber = secretNumber;
        this.attempts = 0;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public int getAttempts() {
        return attempts;
    }

    public void increaseAttempts() {
        attempts++;
    }
}