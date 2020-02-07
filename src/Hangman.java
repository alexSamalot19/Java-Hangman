public class Hangman {
    public static void main(String[] args){

        //Make a new instance of a game
        Game game = new Game("treehouse");
        System.out.println("CLI ran");

        Prompter prompter = new Prompter(game);
        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("hit");
        } else {
            System.out.println("miss");
        }
    }
}
