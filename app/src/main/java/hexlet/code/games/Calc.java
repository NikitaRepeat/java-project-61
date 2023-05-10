package hexlet.code.games;

import java.util.Random;

public class Calc {
    private static final int MULTIPLE = 100;
    private static final int NUMBER_OF_OPERATION = 3;
    public static String calculator() {
        int randomNumber1 = (int) (Math.random() * MULTIPLE);
        int randomNumber2 = (int) (Math.random() * MULTIPLE);
        Random rand = new Random();
        int operation = rand.nextInt(NUMBER_OF_OPERATION);
        int result = 0;
        if (operation == 1) {
            System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
            result = randomNumber1 + randomNumber2;
            return Integer.toString(result);
        } else if (operation == 2) {
            System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
            result = randomNumber1 - randomNumber2;
            return Integer.toString(result);
        } else {
            System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
            result = randomNumber1 * randomNumber2;
            return Integer.toString(result);
        }
    }
}
