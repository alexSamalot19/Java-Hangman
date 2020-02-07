import java.util.Scanner;

public class Prompter {
    // Instance of game
    private Game game;

    //Constructor that requires game
    public Prompter(Game game) {
        this.game = game;
    }

    public boolean promptForGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter:  ");
        //Parse input
        String guessInput = scanner.nextLine();
        char guess = guessInput.charAt(0);
        return game.applyGuess(guess);
    }

    public void displayProgress() {
        System.out.printf("Try to solove:  %s %n",
                game.getCurrentProgress());
    }

}
