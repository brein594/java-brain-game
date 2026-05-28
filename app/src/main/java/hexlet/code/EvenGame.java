package hexlet.code;

public class EvenGame {

    public static void game() {
        final int MaxGame = 2;

        var userName = GreetGame.game();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i <= MaxGame; i++) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            var userQuestion = Cli.scanerString();
            if (isEven(randomNumber).equals(userQuestion)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userQuestion + "' is wrong answer ;(. Correct answer was '" + isEven(randomNumber) + "'");
                System.out.println("Let's try again, " + userName);
                break;
            }
            if (i == MaxGame) {
                System.out.println("Congratulations, " + userName);
            }
        }

    }

    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
