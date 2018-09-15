public class CellBoardGenerator {

    Cell[][] cell;


    public Cell[][] generateCells(Difficulty difficulty) {

        int[] bombPlacesRow = new int[difficulty.getNumOfBombs()];
        int[] bombPlacesCol = new int[difficulty.getNumOfBombs()];


        for (int i = 0; i < bombPlacesRow.length; i++) {
            bombPlacesRow[i] = (int) Math.floor(Math.random() * difficulty.getRow());
        }

        for (int i = 0; i < bombPlacesCol.length; i++) {
            bombPlacesCol[i] = (int) Math.floor(Math.random() * difficulty.getCol());
        }

        Cell[][] cell = new Cell[difficulty.getCol()][difficulty.getRow()];
        for (int i = 0; i < difficulty.getRow(); i++) {
            for (int j = 0; j < difficulty.getCol(); j++) {
                cell[i][j] = new Cell();
            }
        }

        for (int i = 0; i < bombPlacesCol.length; i++) {
            cell[bombPlacesRow[i]][bombPlacesCol[i]].setABomb(true);
        }

        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (!cell[i][j].isABomb()) {
                    int numOfBombsAround = 0;
                    for (int k = -1; k < 2; k++) {
                        for (int l = -1; l < 2; l++) {
                            if (cell[i + k][j + l].isABomb()) numOfBombsAround++;
                            cell[i][j].setBombsAround(numOfBombsAround);
                        }
                    }
                }

            }
        }
        this.cell = cell;
        return cell;
    }

    public String[][] generateCellsDisplay(){

        String[][] display = new String[cell.length][cell.length];

        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display.length; j++) {
                display[i][j] = new String();
            }

        }


        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i][j].isABomb()) {
                    display[i][j] = "X";
                } else display[i][j] = cell[i][j].getBombsAround().toString();
            }
            
        }


        StringBuilder sb = new StringBuilder();
        int a = 0;
        switch (cell.length) {
            case 10:
                a = 10;
                break;
            case 20:
                a = 20;
                break;
            case 30:
                a = 30;
                break;
        }
        for (int i = 0; i < a; i++) {
                    sb.append("%-15s");
                }
         sb.append("\n");
        String format = sb.toString();

        for (String[] item:
             display) {
            System.out.format(format,item);
        }



        return display;
    }
}
