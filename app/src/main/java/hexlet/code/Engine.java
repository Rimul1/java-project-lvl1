package hexlet.code;


import java.util.Scanner;
import java.util.function.Supplier;

public class Engine {
    private static final int GAME_COUNT = 3;

    public final void run(String description, Supplier<RoundData> supplier) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name  + "!");

        System.out.println(description);
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.print("Question: ");
            RoundData roundData = supplier.get();
            System.out.println(roundData.question());

            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (!roundData.answer().equalsIgnoreCase(userAnswer)) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + roundData.answer() + ".\n"
                        + "Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
