package hexlet.code;

import java.util.Scanner;
public class Cli {
    private static String nameUser;
    public static String getName() {
        return nameUser;
    }
    public static void welcomeUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May i have your name? ");
        Scanner scanner = new Scanner(System.in);
        nameUser = scanner.nextLine().toLowerCase();
        nameUser = nameUser.substring(0, 1).toUpperCase() + nameUser.substring(1);
        System.out.println();
        System.out.println("Hello, " + nameUser + "!");
    }
}
