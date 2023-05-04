package hexlet.code;

import java.util.Scanner;
public class Cli {
    private static String nameUser;
    public static String getName() {
        return nameUser;
    }
    public static void welcomeUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have your name?");
        Scanner scanner = new Scanner(System.in);
        nameUser = scanner.nextLine();
        System.out.println("Hello, " + nameUser + "!");
    }
}
