import java.util.ArrayList;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Bowling {


    static String input;
    static String throwString;
    static String[] partsRound;
    static String[] partsThrows;
    static int rounds;
    static int score = 0;
    static ArrayList<Integer> scores = new ArrayList<>();
    static boolean evenStrike = true;
    static int roundScore = 0;
    static boolean endRound = false;
    static int nrRound = 0;


    public static void main(String[] args) {

        input = "10:10,10,10,10,10,10,10,10,10,10,10,10";

        cleanString();

        startGame();

        print();
    }


    static void print() {
        for (int i = 0; i < scores.size(); i++) {
            if (i == scores.size() -1) {
                System.out.print(scores.get(i));
            }
            else{
                System.out.print(scores.get(i) + ",");
            }
        }
    }

    static void cleanString() {
        partsRound = input.split(":");
        rounds = Integer.parseInt(partsRound[0]);  
        throwString = partsRound[1];
        partsThrows = partsRound[1].split(",");
    }


    static void startGame() {

        boolean firstThrow = true;

        for (int i = 0; i < partsThrows.length; i++) {
            endRound = false;

            if (nrRound == rounds) {
                break;
            }

            if (firstThrow){
                roundScore = Integer.parseInt(partsThrows[i]);
                if (roundScore == 10) {
                    endRound = true;
                    nrRound++;
                    addStrike(i);
                }
                else{
                    firstThrow = false;
                }

            }
            else{
                roundScore = roundScore + Integer.parseInt(partsThrows[i]);
                endRound = true;
                nrRound++;

                if (roundScore == 10) {
                    addSpare(i);
                }
                else{
                    addScore(i);
                }

                firstThrow = true;
            }
            //System.out.println(roundScore);


        }
    }


    private static void addSpare(int i) {

        if (partsThrows.length > i+1){
            roundScore = roundScore + Integer.parseInt(partsThrows[i+1]);
        }

        addScore(i);
    }


    private static void addStrike(int i) {

        if (partsThrows.length > i+2) {
            roundScore = roundScore + Integer.parseInt(partsThrows[i+1]) + Integer.parseInt(partsThrows[i+2]);
        }
        else if (partsThrows.length > i+1){
            roundScore = roundScore + Integer.parseInt(partsThrows[i+1]);
        }

        addScore(i);
    }


    private static void addScore(int i) {
        if (i == 0 && endRound){
            scores.add(roundScore);
        }
        else if (i == 1 && endRound) {
            
            if (scores.size() == 1) {
                scores.add(roundScore + scores.get(scores.size() -1));
            }
            else{
                scores.add(roundScore);
            }
        }
        else{
            scores.add(roundScore + scores.get(scores.size() -1));
        }
        roundScore = 0;
    }
}