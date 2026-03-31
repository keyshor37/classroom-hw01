
    package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

    @RestController
    public class GameController {

        // instance variable to store all active games
        private Map<UUID, Game> games = new HashMap<>();

        @GetMapping("/game")
        public String createGame() {
            UUID gameId = UUID.randomUUID();
            int secretNumber = ThreadLocalRandom.current().nextInt(1, 101);
            games.put(gameId, new Game(secretNumber));
            return gameId.toString();
        }

        @GetMapping("/game/{gameId}/guess/{number}")
        public String guess(@PathVariable UUID gameId, @PathVariable int number) {
            Game game = games.get(gameId);

            if (game == null) {
                return "Game not found";
            }

            game.increaseAttempts();

            if (game.getSecretNumber() < number) {
                return "Nr is smaller";
            } else if (game.getSecretNumber() > number) {
                return "Nr is bigger";
            } else {
                return "Correct, it took you " + game.getAttempts() + " times";
            }
        }
    }

