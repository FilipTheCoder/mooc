
public class MagicSquareFactory {

    private int[][] square;



    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) {
            return null;
        }
        this.square = new int[size][size];
        makeMagic();

        MagicSquare square = new MagicSquare(size);
        for (int i = 0; i < this.square.length; i++) {
            for (int j = 0; j < this.square.length; j++) {
                square.placeValue(i, j, this.square[i][j]);

            }

        }

        return square;
    }

    private void makeMagic() {

        int row = 0;
        int column = (square.length / 2);
        int numberToSet = 1;
        int lastWrittenRow = row;
        int lastWrittenColumn = column;

        while (numberToSet != (square.length * square.length)+1) {
            if (row < 0) {
                row = square.length - 1;
            } else if (row >= square.length) {
                row = 0;

            }
            if (column < 0 ) {
                column = square.length - 1;
            } else if (column >= square.length) {
                column = 0;
            }
            if (square[row][column] != 0) {
                if (lastWrittenRow == row) {
                    row += 2;
                    column = lastWrittenColumn;
                } else {
                    row++;
                }

            } else {
                square[row][column] = numberToSet;
                
                lastWrittenColumn = column;
                row--;
                if(row < 0) {
                    lastWrittenRow = square.length - 1;
                }
                else {
                    lastWrittenRow = row;
                }
                
                column++;
                numberToSet++;
            }
            
        }

    }

}
