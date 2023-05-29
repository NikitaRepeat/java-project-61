package hexlet.code;

import java.util.Arrays;
import java.util.Random;

public class Games {
    private static final int MULTIPLE = 100;
    private static final int NUMBER_OF_OPERATION = 3;
    private static final int BOUND_FOR_FIRST_NUMBER = 10;
    private static final int BOUND_FOR_DIFFERENCE = 9;
    private static final int LEFT_NUMBER = 6;
    private static final int BOUND_FOR_PROGRESSION = 5;
    private static final int CHOICE1 = 1;
    private static final int CHOICE2 = 2;
    private static final int CHOICE3 = 3;
    private static final int CHOICE4 = 4;
    private static final int CHOICE5 = 5;
    private static final int CHOICE6 = 6;
    public static String[][] gameClass(int chosenGames) {
        String[][] results = {
                {"Question: ", "no"}
        };
        StringBuilder sb = new StringBuilder(results[0][0]);
        if (chosenGames == CHOICE2) {
            int randomNumber = (int) (Math.random() * MULTIPLE);
            sb.append(randomNumber);
            if (randomNumber % 2 == 0) {
                results[0][1] = "yes";
            }
            System.out.println(sb);
        } else if (chosenGames == CHOICE3) {
            int randomNumber1 = (int) (Math.random() * MULTIPLE);
            int randomNumber2 = (int) (Math.random() * MULTIPLE);
            Random rand = new Random();
            int operation = rand.nextInt(NUMBER_OF_OPERATION);
            int result = 0;
            if (operation == 1) {
                result = randomNumber1 + randomNumber2;
                sb.append(randomNumber1).append(" + ").append(randomNumber2);
                results[0][1] = Integer.toString(result);
            } else if (operation == 2) {
                result = randomNumber1 - randomNumber2;
                sb.append(randomNumber1).append(" - ").append(randomNumber2);
                results[0][1] = Integer.toString((result));
            } else {
                result = randomNumber1 * randomNumber2;
                sb.append(randomNumber1).append(" * ").append(randomNumber2);
                results[0][1] = Integer.toString(result);
            }
            System.out.println(sb);
        } else if (chosenGames == CHOICE4) {
            int randomNumber1 = (int) (1 + Math.random() * MULTIPLE);
            int randomNumber2 = (int) (1 + Math.random() * MULTIPLE);
            int gcd = 0;
            for (int i = 1; i <= randomNumber1 && i <= randomNumber2; i++) {
                if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                    gcd = i;
                }
            }
            sb.append(randomNumber1).append(" ").append(randomNumber2);
            results[0][1] = Integer.toString(gcd);
            System.out.println(sb);
        } else if (chosenGames == CHOICE5) {
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
            String result = Arrays.toString(progressionString).replace("[", "")
                    .replace("]", "").replace(",", "");
            results[0][1] = replaceMemberValue;
            sb.append(result);
            System.out.println(sb);
        } else if (chosenGames == CHOICE6) {
            int randPrimeNumber = (int) (2 + Math.random() * MULTIPLE);
            sb.append(randPrimeNumber);
            for (int i = 2; i < randPrimeNumber; i++) {
                if (randPrimeNumber % i == 0) {
                    results[0][1] = "no";
                    break;
                } else {
                    results[0][1] = "yes";
                }
            }
            System.out.println(sb);
        }
        return results;
    }
}
