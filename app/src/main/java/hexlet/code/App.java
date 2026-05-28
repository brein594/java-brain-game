package hexlet.code;
import hexlet.code.Cli;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - Event");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        var numberGame = Cli.scanerString();
        switch(numberGame) {
            case ("0"):
                System.exit(0);
                break;
            case ("1"):
                GreetGame.game();
                break;
            case ("2"):
               EvenGame.game();
                break;
            default:
                System.exit(0);
                break;
        }

    }
}
