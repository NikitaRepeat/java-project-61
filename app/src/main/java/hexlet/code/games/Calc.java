package hexlet.code.games;

import java.util.Random;

public class Calc {
    private static final int MULTIPLE = 100;
    public static String calculator() {
        int randomNumber1 = (int) (Math.random() * MULTIPLE);
        int randomNumber2 = (int) (Math.random() * MULTIPLE);
        Random rand = new Random();
        int operation = rand.nextInt(3);
        int result = 0;
        if (operation == 1) {
            System.out.println("Question: " + randomNumber1 + "+" + randomNumber2);
            result = randomNumber1 + randomNumber2;
            return Integer.toString(result);
        } else if (operation == 2) {
            System.out.println("Question: " + randomNumber1 + "-" + randomNumber2);
            result = randomNumber1 - randomNumber2;
            return Integer.toString(result);
        } else {
            System.out.println("Question: " + randomNumber1 + "*" + randomNumber2);
            result = randomNumber1 * randomNumber2;
            return Integer.toString(result);
        }
    }
}
