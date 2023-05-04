package hexlet.code.games;

public class Even {
    private static final int MULTIPLE = 100;
    public static String evenGame() {
        int randomNumber = (int) (Math.random() * MULTIPLE);
        System.out.println("Question:" + randomNumber);
        System.out.println("Your answer: ");
        if (randomNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
