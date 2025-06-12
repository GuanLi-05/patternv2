package main;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

// Contains the pattern/sequence
public class PatternObject {
    private List<Integer> pattern = new ArrayList<>();
    private List<Integer> answers = new ArrayList<>();
    private int correctIndex;

    public OptionalInt getLastTerm() {
        if (pattern.size() == 0) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(pattern.get(pattern.size() - 1));
    }

    public OptionalInt getSecondLastTerm() {
        if (pattern.size() < 2) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(pattern.get(pattern.size() - 2));
    }

    public void addTerm(int term) {
        pattern.add(term);
    }

    public void setCorrect(int correctIndex) {
        this.correctIndex = correctIndex;
    }

    public void addAnswer(int answer) {
        answers.add(answer);
    }

    public void printPattern() {
        System.out.println("Sequence: " + pattern);
    }

    public void printAnswer() {
        System.out.println("Answers: " + answers);
        System.out.println("Correct: " + answers.get(correctIndex));
    }
}


