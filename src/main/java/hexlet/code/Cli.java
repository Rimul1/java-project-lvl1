package hexlet.code;


import java.util.Scanner;

public final class Cli {
    private String name;

    public String getName() {
        return name;
    }

    public Cli() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        this.name = scanner.next();
        System.out.println("Hello, " + getName() + "!");
    }
}
