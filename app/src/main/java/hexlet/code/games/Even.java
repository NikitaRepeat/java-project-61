package hexlet.code.games;

public class Even {
    public static String evenGame() {
        int b = 100;
        int randomNumber = (int) (Math.random() * b);
        System.out.println("Question:" + randomNumber);
        System.out.println("Your answer: ");
        if (randomNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
