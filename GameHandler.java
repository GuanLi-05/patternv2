package main;

import java.util.Random;

import main.Patterns.PatternList;
import main.Patterns.Interfaces.Pattern;

public class GameHandler {
    private Random rand = new Random();
    private PatternObject pattern = new PatternObject();
    private Pattern p = PatternList.getRandomPattern();

    public void generatePattern(int n) {
        System.out.println("/////////////////////////////////");
        p.printInfo(); 
        System.out.println("difficulty score: " + p.difficulty());
        for (int i = 0; i < n; i++) {
            pattern.addTerm(p.returnOutput(pattern));
        }
        pattern.printPattern();
        System.out.println("/////////////////////////////////");
    }   

    public void generateMultipleChoice(int n) {
        if (n < 1) {
            throw new Error("Minimum 1 option"); // temp error
        }
        int correct = p.returnOutput(pattern);

        int mod = -rand.nextInt(n);
        for (int i = 0; i < n; i++) {
            pattern.addAnswer(correct + mod);
            if (mod == 0) {
                pattern.setCorrect(i);
            }
            mod++;
        }
        pattern.printAnswer();
        System.out.println("/////////////////////////////////");
    }

    public static void main(String[] args) {
        GameHandler g = new GameHandler();
        g.generatePattern(4);
        g.generateMultipleChoice(4);

    }
}
