public class CellBoardGenerator {

    public Cell[][] generateCells(Difficulty difficulty){
        Cell[][] cell = new Cell[difficulty.getCol()][difficulty.getRow()];

        return cell;
    }

    public String[][] generateCellsDisplay(){
        String[][] string = new String[5][5];
        return string;
    }
}
