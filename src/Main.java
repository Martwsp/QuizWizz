import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to QuizWizz");
        while (true) {
            Game game = new Game();
            game.game();
            System.out.println("play again? Y/N");
            if (Objects.equals(game.tryAgain().toUpperCase(), "N")) {
                break;
            }
        }
        System.out.println("Thank you for playing");
}
}