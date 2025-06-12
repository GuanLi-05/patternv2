package main.Patterns;

import java.util.OptionalInt;
import java.util.Random;

import main.PatternObject;
import main.Patterns.Interfaces.Pattern;
import main.Patterns.Interfaces.SimpleComposable;

public class Square implements Pattern, SimpleComposable {
    private Random rand = new Random();
    private static final int STARTING_LOWER = 2;
    private static final int STARTING_UPPER = 5;
    private int startingTerm = rand.nextInt(STARTING_UPPER - STARTING_LOWER) + STARTING_LOWER;

    @Override
    public int returnOutput(PatternObject p) {
        OptionalInt n = p.getLastTerm();
        if (n.isPresent()) {
            return n.getAsInt() * n.getAsInt();
        }
        return startingTerm;
    }

    @Override
    public int simpleOutput(int x) {
        return x * x;
    }

    @Override
    public void printInfo() {
        System.out.println("Square");
    }

    @Override
    public int difficulty() {
        return 2;
    }
}
