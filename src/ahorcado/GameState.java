package ahorcado;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    private String word;
    private boolean[] hits;
    private int attempts;
    private List<Character> usedLetters = new ArrayList<>();

    public GameState(String word) {
        this.word = word;
        this.hits = new boolean[this.word.length()];
    }

    public boolean isOver() {
        boolean pendingLetters = false;

        for (int i = 0; i < hits.length; i++) {
            if (hits[i] == false) {
                pendingLetters = true;
                break;
            }
        }

        if ((pendingLetters == true && attempts == 10) || pendingLetters == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUsedLetter(Character letter) {
        if (usedLetters.contains(letter)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addUsedLetter(Character letter) {
        if (!usedLetters.contains(letter)) {
            usedLetters.add(letter);
            return true;
        } else {
            return false;
        }
    }

    public boolean hasWon() {
        if (isOver() && attempts < 10) {
            return true;
        } else {
            return false;
        }
    }

    public String checkLetter(char letter) {
        if (isUsedLetter(letter)) {
            attempts++;
            return "Esta letra está repetida, pierdes un intento.";
        } else {
            addUsedLetter(letter);
        }

        int coincidence = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                hits[i] = true;
                coincidence++;
            }
        }

        if (coincidence == 0) {
            attempts++;
            return "Fallaste wey";
        } else {
            return "Muy bien!";
        }
    }


    public String getCurrentResult() {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (hits[i] == false) {
                result = result + "_ ";
            } else {
                result = result + word.charAt(i);
            }
        }


        return result;
    }
    
    public int getAttemptsLeft() {
        return 10 - attempts;
    }

}

