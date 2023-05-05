package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;
public class Engine {
    private static int choice1 = 1;
    private static int choice2 = 2;
    private static int choice3 = 3;
    private static int choice4 = 4;
    private static int choice5 = 5;
    private static int choice6 = 6;
    public static void choiceGames(int choiceUser) {
        if (choiceUser == choice1) {
            Cli.welcomeUser();
        } else if (choiceUser == choice2) {
            Cli.welcomeUser();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            game(choiceUser);
        } else if (choiceUser == choice3) {
            Cli.welcomeUser();
            System.out.println("What is the result of the expression?");
            game(choiceUser);
        } else if (choiceUser == choice4) {
            Cli.welcomeUser();
            System.out.println("Find the greatest common divisor of given numbers.");
            game(choiceUser);
        } else if (choiceUser == choice5) {
            Cli.welcomeUser();
            System.out.println("What number is missing in the progression?");
            game(choiceUser);
        } else if (choiceUser == choice6) {
            Cli.welcomeUser();
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            game(choiceUser);
        } else {
            System.out.println("Goodbye!");
        }
    }
    public static void game(int choiceUser) {
        boolean check = true;
        int count = 0;
        int countRightAnswer = 0;
        String answerRight = "";
        while (count < 3) {
            if (choiceUser == 2) {
                answerRight = Even.evenGame();
            } else if (choiceUser == 3) {
                answerRight = Calc.calculator();
            } else if (choiceUser == 4) {
                answerRight = GCD.gcdGame();
            } else if (choiceUser == 5) {
                answerRight = Progression.proGame();
            } else if (choiceUser == 6) {
                answerRight = Prime.primeGame();
            } else {
                System.out.println("Goodbye!");
            }
            Scanner sc = new Scanner(System.in);
            String answerUser = sc.nextLine();
            if (answerRight.equals(answerUser)) {
                System.out.println("Correct!");
                countRightAnswer += 1;
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was " + answerRight);
                System.out.println("Let's try again, " + Cli.getName() + "!");
            }
            count += 1;
        }
        if (countRightAnswer == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
