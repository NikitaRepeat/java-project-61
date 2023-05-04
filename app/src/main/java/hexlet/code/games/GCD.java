package hexlet.code.games;

public class GCD {
    public static String gcdGame() {
        int b = 100;
        int randomNumber1 = (int) (Math.random() * b);
        int randomNumber2 = (int) (Math.random() * b);
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
