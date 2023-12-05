public class Coordinates {
    private final int row;
    private final int col;

    public Coordinates(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // 기본생성자로 row, col -1으로 초기화.
    public Coordinates() {
        this.row = -1;
        this.col = -1;
    }
    // getter-setter 문법.
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}