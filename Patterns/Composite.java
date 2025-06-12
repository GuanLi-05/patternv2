package main.Patterns;

import main.PatternObject;
import main.Patterns.Interfaces.ComplexComposable;
import main.Patterns.Interfaces.Pattern;
import main.Patterns.Interfaces.SimpleComposable;

public class Composite implements Pattern {
    private Pattern c1;
    private Pattern c2;

    public Composite() {
        do {
            c1 = PatternList.getRandomPattern();
        } while (!(c1 instanceof ComplexComposable || c1 instanceof SimpleComposable));

        do {
            c2 = PatternList.getRandomPattern();
        } while (!(c2 instanceof SimpleComposable) || c1.getClass().equals(c2.getClass()));
    }

    @Override
    public int returnOutput(PatternObject p) {
        SimpleComposable s2 = (SimpleComposable) c2;
        return s2.simpleOutput(c1.returnOutput(p));
    }

    @Override
    public void printInfo() {
        System.out.println("Composite Pattern: ");
        c1.printInfo();
        c2.printInfo();
    }

    @Override
    public int difficulty() {
        return c1.difficulty() + c2.difficulty() + 1;
    }
}
