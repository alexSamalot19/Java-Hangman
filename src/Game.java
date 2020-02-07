public class Game {
    public static final int MAX_MISSES = 7;
    private String answer;
    private String hits;
    private String misses;


    // The answer ot the game should be made when a new game is started
    // The constructor:
    public Game(String answer) {
        this.answer = answer.toLowerCase();
        // Initialize hits and misses
        hits = "";
        misses = "";
    }

    private char normalizeGuess(char letter){
        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("A letter is Required");
        }
        letter = Character.toLowerCase(letter);
        if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1){
            throw new IllegalArgumentException("letter has already been guessed!");
        }
        return letter;
    }

    public boolean applyGuess(String letters) {
        if (letters.length()==0) {
            throw new IllegalArgumentException("no letter");
        }
        return applyGuess(letters.charAt(0));
    }

    // Method to determine if guess is hit or miss
    public boolean applyGuess(char letter){
        letter = normalizeGuess(letter);
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
