package ahorcado;

public class GameRunner {

    private GameState game;
    private String word;
    private Player player;

    public GameRunner() {
        Dictionary dictionary = new Dictionary();
        this.word = dictionary.getRandomWord();
        this.game = new GameState(word);
        this.player = new Player();
    }

    public void run() {
        while (!game.isOver()) {
            GamePrinter.printCurrentResult(game.getCurrentResult());
            char letter = player.chooseLetter();
            game.checkLetter(letter);
        }
        GamePrinter.printWord(word);
        GamePrinter.printFinalResult(game);
    }

}

