package com.priyavrat;

public class Main {

    public static void main(String[] args) {
        int highScore1=calculatescore(true,800,5,100);
        int highScore2=calculatescore(true,500,10,3500);
        System.out.println("HighScore1: "+highScore1 +"Highscore2: "+highScore2);

        int result=calculateHighScorePosition(499);
        displayHighScorePosition("Priyavrat",result);

    }

    public static int calculatescore(boolean gameover,int score,int levelCompleted,int bonus){
        if(gameover){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=1000;
            //System.out.println("Your final score was "+finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name,int position){
        System.out.println(name+" managed to get into position "+position+" into the highscore table.");
    }

    public static int calculateHighScorePosition(int score){
        if(score>=1000)
            return 1;
        else if(score>=500 && score<1000)
            return 2;
        else if(score >=100 && score<500)
            return 3;
        else
            return 4;
    }
}
