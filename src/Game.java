public class Game {
    public static final int MAX_MISSES = 7;
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

    public int getRemainingTries(){
        return MAX_MISSES-misses.length();
    }

    //Return the game progress
    public String getCurrentProgress() {
        String progress = "";
        for (char letter : answer.toCharArray()){
            char display = '-';
            if(hits.indexOf(letter) != -1){
                display = letter;
            }
            progress += display;
        }
        return progress;
    }


}
