package main.Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.Patterns.Interfaces.Pattern;

public class PatternList {
    private static final Random rand = new Random();
    private static final List<Pattern> patterns = new ArrayList<>();

    // Initialise all patterns into list
    static {
        patterns.add(new Arithmetic());
        patterns.add(new Geometric());
        patterns.add(new Fibonacci());
        patterns.add(new Composite());
        patterns.add(new Square());
    }

    public static Pattern getRandomPattern() {
        return patterns.get(rand.nextInt(patterns.size()));
    }
}
