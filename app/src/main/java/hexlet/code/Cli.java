package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;

    public Cli() {
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
       Cli.name = name;
    }

    public void greet() {
        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        setName(scanner.next());
        System.out.println("Hello, " + getName());
    }

}
