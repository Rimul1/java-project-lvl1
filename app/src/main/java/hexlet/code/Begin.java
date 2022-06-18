package hexlet.code;

import java.util.Scanner;

public class Begin {
    public static void print() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int number = scanner.nextInt();
        System.out.println();

        Cli cli = new Cli();
        switch (number) {
            case 0:
                break;
            case 1:
                cli.greet();
            case 2:
                Even.parity();
        }
    }
}
