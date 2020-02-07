public class Hangman {
    public static void main(String[] args){

        //Make a new instance of a game
        Game game = new Game("treehouse");
        System.out.println("CLI ran");

        Prompter prompter = new Prompter(game);

        while (game.getRemainingTries() > 0) {
            prompter.displayProgress();
            prompter.promptForGuess();

        }

    }
}
