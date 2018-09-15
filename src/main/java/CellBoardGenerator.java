public class CellBoardGenerator {



    public Cell[][] generateCells(Difficulty difficulty){

        int[] bombPlacesRow = new int[difficulty.getNumOfBombs()];
        int[] bombPlacesCol = new int[difficulty.getNumOfBombs()];


        for (int i = 0; i < bombPlacesRow.length; i++) {
            bombPlacesRow[i] = (int)Math.floor(Math.random()*difficulty.getRow());
        }
        for (int i = 0; i < bombPlacesCol.length; i++) {
            bombPlacesCol[i] = (int)Math.floor(Math.random()*difficulty.getCol());
        }

        Cell[][] cell = new Cell[difficulty.getCol()][difficulty.getRow()];
        for (int i = 0; i < difficulty.getRow(); i++) {
            for (int j = 0; j < difficulty.getCol(); j++) {
                cell[i][j] = new Cell();
            }
        }

        for (int i = 0; i < bombPlacesCol.length; i++) {
            cell[bombPlacesRow[i]][bombPlacesCol[i]].isABomb = true;
        }

        return cell;
    }

    public String[][] generateCellsDisplay(){
        String[][] string = new String[5][5];
        return string;
    }
}
