package bingo;

import java.util.Random;

// Test method for rendering a traditional Bingo Board

class BingoBoard
{
    public static final int ERROR = -1;
    public static final int ROW_COUNT = 5;
    public static final int COLUMN_COUNT = 5;

    private int[][] board = new int [ROW_COUNT][COLUMN_COUNT];

    public BingoBoard() {
        Random random = new Random();
        int[] used = new int [ROW_COUNT*COLUMN_COUNT];
        for (int i=0; i<ROW_COUNT; i++) {
            for (int k=0; k<COLUMN_COUNT; k++) {
                int square = (random.nextInt(15) + 1) + (15*k);
                while (usedCheck(used, square)) {
                    square = (random.nextInt(15) + 1) + (15*k);
                }
                board[i][k] = square;
                used[(i*ROW_COUNT)+k] = square;
            }
        }
        
    }

    public int getSquare( int row, int column) {
        int value = ERROR;
        if ( (0 <= row) && (row < ROW_COUNT) ) {
            if ( (0 <= column) && (column < COLUMN_COUNT) ) {
                value = board[row][column];
            }
        }
        return value;
    }

    public boolean usedCheck (int[] arr, int valueToCheck) {
        
        for (int element : arr) {
            if (element == valueToCheck) {
                return true;
            }
        }

        return false;
    }
}