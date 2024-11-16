package example4;

import java.util.Random;

public class Example4 {
    public static void main(String[] args) {
        riskyProcess();
    }

    private static void riskyProcess() {
        Random random = new Random();

        int bullet = random.nextInt(6);
        int attempts = 3;

        for (int i = 1; i <= attempts; i++) {
            System.out.println("Attempt #" + i + "...");
            if (i - 1 == bullet) {
                System.out.println("Game over, " + i + " was live...");
                throw new RiskyProcessException();
            }
            System.out.println("Lucky, " + i + " was blank!");
        }
        System.out.println("You survived!");
    }
}
