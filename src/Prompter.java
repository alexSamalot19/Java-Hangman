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
        boolean isHit = false;
        boolean isAcceptable = false;

        do{
        System.out.print("Enter a letter:  ");
        //Parse input
        String guessInput = scanner.nextLine();

        try{
            isHit = game.applyGuess(guessInput);
            isAcceptable = true;
        }catch(IllegalArgumentException iae){
            System.out.printf("%s. Please try again. %n",iae.getMessage());
        }
        }while(! isAcceptable);
        return isHit;
    }

    public void displayProgress() {
        System.out.printf("You have %d tries to solove:  %s %n",
                game.getRemainingTries(),
                game.getCurrentProgress());
    }

    public void displayOutcome() {
        if(game.isWon()){
            System.out.printf("You won with %d tries left! %n", game.getRemainingTries());
        } else{
            System.out.printf("Sorry it was %s %n", game.getAnswer());
        }

    }

}
