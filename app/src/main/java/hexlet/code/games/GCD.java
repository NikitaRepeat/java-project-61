package hexlet.code.games;

public class GCD {
    private static final int MULTIPLE = 100;
    public static String gcdGame() {
        int randomNumber1 = (int) (Math.random() * MULTIPLE);
        int randomNumber2 = (int) (Math.random() * MULTIPLE);
        int gcd = 0;
        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        System.out.println("Your answer: ");
        for (int i = 1; i <= randomNumber1 && i <= randomNumber2; i++) {
            if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                gcd = i;
            }
        }
        return Integer.toString(gcd);
    }
}
