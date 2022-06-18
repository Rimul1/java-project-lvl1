package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String name;
    public Cli() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        setName(scanner.next());
        System.out.println("Hello, " + getName());
    }

}
