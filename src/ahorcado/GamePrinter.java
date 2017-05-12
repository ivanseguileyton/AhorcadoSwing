package ahorcado;

public class GamePrinter {

    public static void printFinalResult (GameState game) {
        if (game.hasWon()) {
            System.out.println("Has ganado!!");
        } else {
            System.out.println("Has perdido...");
        }
    }

    public static void printInstructions() { System.out.println("Escoge una letra:"); }

    public static void optionNotValid() { System.out.println("No has escrito un caracter válido! Por favor, escoge una letra"); }

    public static void printCurrentResult(String currentResult) { System.out.println("Palabra: " + currentResult); }

    public static void printWord (String word) { System.out.println("La palabra era: " + word); }
}

