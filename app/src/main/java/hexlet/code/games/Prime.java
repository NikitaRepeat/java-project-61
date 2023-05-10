package hexlet.code.games;

public class Prime {
    public static String primeGame() {
        int randPrimeNumber = (int) (2 + Math.random() * 100);
        System.out.println("Question: " + randPrimeNumber);
        System.out.println("Your answer: ");
        for (int i = 2; i < randPrimeNumber; i++) {
            if (randPrimeNumber % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
