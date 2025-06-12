package main.Patterns.Interfaces;

import main.PatternObject;

public interface Pattern {
    public int returnOutput(PatternObject p);
    public void printInfo();
    public int difficulty();
}