package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;
public class Engine {
    private static final int CHOICE1 = 1;
    private static final int CHOICE2 = 2;
    private static final int CHOICE3 = 3;
    private static final int CHOICE4 = 4;
    private static final int CHOICE5 = 5;
    private static final int CHOICE6 = 6;
    private static final int NUMBER_ATTEMPTS = 2;

    public static void choiceGames(int choiceUser) {
        if (choiceUser == CHOICE1) {
            Cli.welcomeUser();
        } else if (choiceUser == CHOICE2) {
            Cli.welcomeUser();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            game(choiceUser);
        } else if (choiceUser == CHOICE3) {
            Cli.welcomeUser();
            System.out.println("What is the result of the expression?");
            game(choiceUser);
        } else if (choiceUser == CHOICE4) {
            Cli.welcomeUser();
            System.out.println("Find the greatest common divisor of given numbers.");
            game(choiceUser);
        } else if (choiceUser == CHOICE5) {
            Cli.welcomeUser();
            System.out.println("What number is missing in the progression?");
            game(choiceUser);
        } else if (choiceUser == CHOICE6) {
            Cli.welcomeUser();
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            game(choiceUser);
        } else {
            System.out.println("Goodbye!");
        }
    }

    public static void game(int choiceUser) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String answerRight = "";
        String answerUser = null;
        boolean runGame = true;
        boolean winTitle = false;
        while (runGame) {
            if (choiceUser == CHOICE2) {
                answerRight = Even.evenGame();
            } else if (choiceUser == CHOICE3) {
                answerRight = Calc.calculator();
            } else if (choiceUser == CHOICE4) {
                answerRight = GCD.gcdGame();
            } else if (choiceUser == CHOICE5) {
                answerRight = Progression.proGame();
            } else if (choiceUser == CHOICE6) {
                answerRight = Prime.primeGame();
            } else {
                System.out.println("Goodbye!");
            }
            answerUser = sc.nextLine();
            runGame = answerUser.equals(answerRight);
            if (runGame && count < NUMBER_ATTEMPTS) {
                System.out.println("Correct!");
                count++;
            } else {
                winTitle = answerUser.equals(answerRight);
                runGame = false;
            }
        }
        System.out.println(endGame(Cli.getName(), answerUser, winTitle, answerRight));
    }
    public static String endGame(String name, String answer, boolean winTitle, String correctAnswer) {
        return winTitle ? "Congratulations, " + name + "!" : "'" + answer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'." + "\n" + "Let's try again, " + name + "!";
    }
}

