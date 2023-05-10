package hexlet.code.games;

import java.util.Arrays;

public class Progression {
    private static final int BOUND_FOR_FIRST_NUMBER = 10;
    private static final int BOUND_FOR_DIFFERENCE = 9;
    private static final int LEFT_NUMBER = 6;
    private static final int BOUND_FOR_PROGRESSION = 5;
    public static String proGame() {
        int firstNumber = (int) (1 + Math.random() * BOUND_FOR_FIRST_NUMBER);
        int difference = (int) (1 + Math.random() * BOUND_FOR_DIFFERENCE);
        int[] progression = new int[LEFT_NUMBER + (int) (Math.random() * BOUND_FOR_PROGRESSION)];
        String[] progressionString = new String[progression.length];
        progression[0] = firstNumber;
        progressionString[0] = Integer.toString(firstNumber);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + difference;
            progressionString[i] = Integer.toString(progression[i]);
        }
        int memberProgression = (int) (Math.random() * progression.length);
        String replaceMemberValue = progressionString[memberProgression];
        progressionString[memberProgression] = "..";
        String result = Arrays.toString(progressionString).replace("[", "").replace("]", "").replace(",", "");
        System.out.println("Question: " + result);
        System.out.println("Your answer: ");
        return replaceMemberValue;
    }
}
