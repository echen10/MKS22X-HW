public class QueenBoard{
    private int[][] board;
    private int solutionCount = -1;
    
    public QueenBoard(int size) {
	board = new int[size][size];
    }

    private void addQueen(int r, int c) {
	board[r][c]++;
	
	//updateBoardState

	//right side
	for ( int col = c+1; col < board[col].length; col++ ) {
	    board[r][col]++;
	}
	//upper diagonal
	int row = r-1;
	for ( int col = c+1; col < board[col].length && row > 0; col++, row-- ) {
	    board[row][col]++;
	}
	//lower diagonal
        row = r+1;
	for ( int col = c+1; col < board[col].length && row < board.length; col++, row++ ) {
	    board[row][col]++;
	}
    }

    private void removeQueen(int r, int c) {
	board[r][c]--;
	
	//updateBoardState
	
	//right side
	for ( int col = c+1; col < board[col].length; col++ ) {
	    board[r][col]--;
	}
	//upper diagonal
	int row = r-1;
	for ( int col = c+1; col < board[col].length && row > 0; col++, row-- ) {
	    board[row][col]--;
	}
	//lower diagonal
        row = r+1;
	for ( int col = c+1; col < board[col].length && row < board.length; col++, row++ ) {
	    board[row][col]--;
	}
    }
    
    public void solve() {
	
        solveH(0);
    }

    private boolean solveH(int col) {
	if ( col > board.length ) {
	    return solutionCount == board.length;
	}
	for ( int row = 0; row < board[col].length; row++ ) {
	    if ( board[col][row] == 0 ) {
		addQueen(row,col);
		return solveH(col+1);
	    }	
	}
	return solveH(col+1);
    }

    public void countSolutions() {
    }
    
    public int getCount() {
    	return solutionCount;
    }

    public String toString() {
	String ans = "";
	for ( int row = 0; row < board.length; row++ ) {
	    for ( int col = 0; col < board[row].length; col++ ) {
		ans += board[row][col] + ", ";
	    }
	    ans += "\n";
	}
    	return ans;
    }

    /*
    public static void main( String[] args ) {
	QueenBoard q = new QueenBoard(4);
	System.out.println(q);
	q.solve();
	System.out.println(q);
	
	//System.out.println( q.getCount() );
    }
    */
}
