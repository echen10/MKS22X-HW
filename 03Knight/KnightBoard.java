public class KnightBoard() {
    private int[][] board;

    public KnightBoard( int rows, int cols ) {
	board = new int[rows][cols];
    }

    public void solve() {
	solveH(0,0,1);
    }

    private boolean solveH(int row, int col, int level) {
	if ( level >= row*col ) {
	    return true;
	}
	board[row+r][col+c] = level;
	solveH(r,c,level);
    }

    private boolean isGoodSpot(int row, int col) {
	if ( board[row-1][col-2] != 0 ||
	     board[row-2][col-1] != 0 ||
	     board[row-2][col+1] != 0 ||
	     board[row-1][col+2] != 0 ||
	     board[row+1][col+2] != 0 ||
	     board[row+2][col+1] != 0 ||
	     board[row+2][col-1] != 0 ||
	     board[row+1][col-2] != 0 ) {
	    return true;
	}
    }

    public String toString() {
	return "";
    }
}
