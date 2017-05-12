package ahorcado;

import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);

    public char chooseLetter() {

        String letter = "";

        while (true) {
            GamePrinter.printInstructions();

            letter = scanner.next();

            if (letter.length() == 1 && Character.isLetter(letter.charAt(0))) {
                return Character.toUpperCase(letter.charAt(0));
            } else {
                GamePrinter.optionNotValid();
            }
        }

    }

}

