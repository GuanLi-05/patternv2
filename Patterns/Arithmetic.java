package main.Patterns;

import java.util.OptionalInt;
import java.util.Random;

import main.PatternObject;
import main.Patterns.Interfaces.Pattern;
import main.Patterns.Interfaces.SimpleComposable;

public class Arithmetic implements Pattern, SimpleComposable {
    private Random rand = new Random();
    private static final int ARITMOD_LOWER = 1;
    private static final int ARITHMOD_UPPER = 10;
    private int arithMod = rand.nextInt(ARITHMOD_UPPER - ARITMOD_LOWER) + ARITMOD_LOWER;
    private static final int STARTING_LOWER = 1;
    private static final int STARTING_UPPER = 15;
    private int startingTerm = rand.nextInt(STARTING_UPPER - STARTING_LOWER) + STARTING_LOWER;

    @Override
    public int returnOutput(PatternObject p) {
        OptionalInt n = p.getLastTerm();
        if (n.isPresent()) {
            return n.getAsInt() + arithMod;
        }
        return startingTerm;
    }

    @Override
    public int simpleOutput(int x) {
        return x + arithMod;
    }

    @Override
    public void printInfo() {
        System.out.println("Arithmetic: " + arithMod);
    }

    @Override
    public int difficulty() {
        return 1;
    }
}

