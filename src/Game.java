public class Game {
    // Will need to know the answer to the game
    // Should be private because the answer should not change
    private String answer;
    private String hits;
    private String misses;

    // The answer ot the game should be made when a new game is started
    // The constructor:
    public Game(String answer) {
        this.answer = answer;
        // Initialize hits and misses
        hits = "";
        misses = "";
    }

    // Method to determine if guess is hit or miss
    public boolean applyGuess(char letter){
        boolean isHit = answer.indexOf(letter) != -1;

        if (isHit){
            hits += letter;
        } else {
            misses += letter;
        }
        return isHit;
    }


}
