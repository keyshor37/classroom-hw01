
    package com.example.demo;

    public class Game {
        private int secretNumber;
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

