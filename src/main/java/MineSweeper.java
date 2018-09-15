public class MineSweeper {

    GameState gameState;
    Display display;

    public void play(Difficulty difficulty) {
        CellBoardGenerator cellBoardGenerator = new CellBoardGenerator();
        cellBoardGenerator.generateCells(difficulty);
        cellBoardGenerator.generateCellsDisplay();
    }


}
