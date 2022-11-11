package hexlet.code;

import java.util.Scanner;
import java.util.function.Supplier;

public class Engine {
   private static final int GAME_COUNT = 3;
   public void run(String description, Supplier<QuestionAnswer> supplier) {
      Cli cli = new Cli();
      Scanner scanner = new Scanner(System.in);
      boolean win = false;
      System.out.println(description);
      for (int i = 0; i < GAME_COUNT; i++) {
         win = false;
         System.out.print("Question: ");
         QuestionAnswer questionAnswer = supplier.get();
         System.out.println(questionAnswer.getQuestion());

         System.out.print("Your answer: ");
         String userAnswer = scanner.next();
         if (questionAnswer.getAnswer().equalsIgnoreCase(userAnswer)) {
            win = true;
            System.out.println("Correct!");
         } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                    + questionAnswer.getAnswer() + ".\n"
                    + "Let's try again, " + cli.getName() + "!");
            break;
         }
      }

      if (win) {
         System.out.println("Congratulations, " + cli.getName() + "!");
      }
   }
}
