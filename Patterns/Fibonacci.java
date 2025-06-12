package main.Patterns;

import java.util.OptionalInt;
import java.util.Random;

import main.PatternObject;
import main.Patterns.Interfaces.ComplexComposable;
import main.Patterns.Interfaces.Pattern;

public class Fibonacci implements Pattern, ComplexComposable {
    private Random rand = new Random();
    private static final int STARTING_LOWER = 1;
    private static final int STARTING_UPPER = 15;
    private int startingTerm = rand.nextInt(STARTING_UPPER - STARTING_LOWER) + STARTING_LOWER;

    @Override
    public int returnOutput(PatternObject p) {
        OptionalInt o1 = p.getLastTerm();
        OptionalInt o2 = p.getSecondLastTerm();
        if (o2.isEmpty()) {
            if (o1.isEmpty()) {
                return startingTerm;
            }
            return o1.getAsInt();
        }
        return o1.getAsInt() + o2.getAsInt();
    }

    @Override
    public void printInfo() {
        System.out.println("Fibonacci");
    }

    @Override
    public int difficulty() {
        return 3;
    }
}
 