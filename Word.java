package test;


public class Word {

    private Tile[] tiles;
    private int col;
    private int row;
    private boolean vertical;

    public Word(Tile[] tiles, int col, int row, boolean vertical) {
        this.tiles = tiles;
        this.col = col;
        this.row = row;
        this.vertical = vertical;
    }

    public Tile[] getTiles() {
        return tiles;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean isVertical() {
        return vertical;
    }
@Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Word)) return false;
        if (!super.equals(object)) return false;
        Word word = (Word) object;
        return getCol() == word.getCol() && getRow() == word.getRow() && isVertical() == word.isVertical() && java.util.Arrays.equals(getTiles(), word.getTiles());
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), getCol(), getRow(), isVertical());
        result = 31 * result + Arrays.hashCode(getTiles());
        return result;
    }
}
