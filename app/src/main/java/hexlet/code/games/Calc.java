package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String calculator() {
        int b = 100;
        int randomNumber1 = (int) (Math.random() * b);
        int randomNumber2 = (int) (Math.random() * b);
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
