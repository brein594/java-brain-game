package hexlet.code;

import java.util.Scanner;

public class GreetGame {
    public static String game() {
        //Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = Cli.scanerString();
        System.out.println("Hello, " + userName + "!");
        //scanner1.close();
        return userName;
    }
}
