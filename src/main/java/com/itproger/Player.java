package com.itproger;

import java.util.Random;

public class Player {

    private String name = "Bot";
    public VARIANTS choice;

    public Player(VARIANTS choice, String name) {
        this.name = name;
        this.choice = choice;
    }

    public Player() {
        Random random = new Random();
        int d = random.nextInt(3);
        if (d == 0) {
            this.choice = VARIANTS.ROCK;
        } else if (d == 1) {
            this.choice = VARIANTS.SCISSORS;
        } else {
            this.choice = VARIANTS.PAPER;
        }
    }

    public String whoWins(Player firstPlayer, Player secondPlayer) {
        if(firstPlayer.choice == secondPlayer.choice) {
            return "Победила дружба";
        } else if (firstPlayer.choice == VARIANTS.ROCK) {
            return "Победил игрок с именем: " + firstPlayer.name;
        } else {
            return "Победил игрок с именем: " + secondPlayer.name;
        }
    }
}
