package com.priyavrat;


public class Main {

    public static void main(String[] args) {
        calculateScore("Priyavrat",100);
        calculateScore(50);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*100;
    }

    public static int calculateScore(int score){
        System.out.println("Unnmaed player scored "+score+" points");
        return score*100;
    }

    public static int calculateScore(){
        System.out.println("No player name, No player score");
        return 0;
    }
}
