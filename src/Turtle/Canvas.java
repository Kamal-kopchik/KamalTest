package Turtle;

public class Canvas {

    public int height;
    public int width;

    private char[][] field;

    public Canvas(int width, int height) {

        this.width = width;
        this.height = height;
        field = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                field[i][j] = '.';
            }
        }

    }

    public void print() {
        for (char[] row : field) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public void changeData(int row, int col, char data) {
        if (data == '*' || data == '.' && row > 0 && col > 0 && row < height && col < width) {
            field[row][col] = data;
        }
    }
}
