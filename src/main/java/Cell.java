public class Cell {

    private boolean isABomb;
    private Integer bombsAround;

    public boolean isABomb() {
        return isABomb;
    }

    public Cell setABomb(boolean ABomb) {
        isABomb = ABomb;
        return this;
    }

    public Integer getBombsAround() {
        return bombsAround;
    }

    public Cell setBombsAround(Integer bombsAround) {
        this.bombsAround = bombsAround;
        return this;
    }
}
