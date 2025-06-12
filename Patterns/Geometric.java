package main.Patterns;

import java.util.OptionalInt;
import java.util.Random;

import main.PatternObject;
import main.Patterns.Interfaces.Pattern;
import main.Patterns.Interfaces.SimpleComposable;

public class Geometric implements Pattern, SimpleComposable {
    private Random rand = new Random();
    private static final int GEOMETRIC_LOWER = 1;
    private static final int GEOMETRIC_UPPER = 15;
    private int geoMod = rand.nextInt(GEOMETRIC_UPPER - GEOMETRIC_LOWER) + GEOMETRIC_LOWER;
    private static final int STARTING_LOWER = 2;
    private static final int STARTING_UPPER = 15;
    private int startingTerm = rand.nextInt(STARTING_UPPER - STARTING_LOWER) + STARTING_LOWER;

    @Override
    public int returnOutput(PatternObject p) {
        OptionalInt n = p.getLastTerm();
        if (n.isPresent()) {
            return n.getAsInt() * geoMod;
        }
        return startingTerm;
    }

    @Override
    public int simpleOutput(int x) {
        return x * geoMod;
    }

    @Override
    public void printInfo() {
        System.out.println("Geometric: " + geoMod);
    }

    @Override
    public int difficulty() {
        return 1;
    }
}
