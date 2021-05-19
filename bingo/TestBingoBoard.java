package bingo;

/* Test method for rendering a traditional Bingo Board
*/
class TestBingoBoard
{
    BingoBoard bingoBoard;

    //Main method invoked on execution
    public static void main(String args[])
    {
        TestBingoBoard forTesting = new TestBingoBoard(new BingoBoard());
        forTesting.runTests();
    }

    public TestBingoBoard(BingoBoard bingoBoard) {
        this.bingoBoard = bingoBoard;
    }

    public void runTests() {
        testGetSquare(-10,-10);
        testGetSquare(-1,0);
        testGetSquare(0,-1);
        testGetSquare(0,0);
        testGetSquare(1, 1);
        testGetSquare(4,4);
        testGetSquare(5,5);
        testGetSquare(6,0);
        testGetSquare(0,6);
        testGetSquare(10,10);

        renderBoard();
    }

    private void testGetSquare(int row, int column) {
        System.out.println("Value at " + row +"," + column + " is: '" + bingoBoard.getSquare(row,column) + "'");
    }

    private void renderBoard(){
        System.out.println("");
        
        for (int i = 0; i < BingoBoard.ROW_COUNT; i++) {
            for (int k = 0; k < BingoBoard.COLUMN_COUNT; k++) {
                StringBuilder sb = new StringBuilder();
                sb.append("          ");
                sb.append(bingoBoard.getSquare(i,k));
                System.out.print(sb.substring(sb.length()-4));
            }
            System.out.println("");
        }
    }

}