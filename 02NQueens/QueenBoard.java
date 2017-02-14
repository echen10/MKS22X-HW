public class QueenBoard{
    private int[][] board;
    private int solutionCount = -1;
    
    public QueenBoard(int size) {
	board = new int[size][size];
    }

    private void addQueen(int r, int c) {
	if ( r >= board.length || c >= board[0].length ) {
	    throw new ArrayIndexOutOfBoundsException();
	}
	board[r][c]++;
	
	//updateBoardState

	//right side
	if ( c != board.length-1 ) {
	    for ( int col = c+1; col < board[col].length-1; col++ ) {
		board[r][col]++;
	    }
	}
	//upper diagonal
	if ( c != board.length-1 ) {
	    int row = r-1;
	    for ( int col = c+1; col < board[col].length-1 && row > 0; col++, row-- ) {
		board[row][col]++;
	    }
	}
	//lower diagonal
	if ( c != board.length-1 ) {
	    int row = r+1;
	    for ( int col = c+1; col < board[col].length-1 && row < board.length; col++, row++ ) {
		board[row][col]++;
	    }
	}
    }

    private void removeQueen(int r, int c) {
	if ( r >= board.length || c >= board[0].length ) {
	    throw new ArrayIndexOutOfBoundsException();
	}
	board[r][c]--;
	
	//updateBoardState
	
	//right side
	if ( c != board.length-1 ) {
	    for ( int col = c+1; col < board[col].length-1; col++ ) {
		board[r][col]--;
	    }
	}
	//upper diagonal
	if ( c != board.length-1 ) {
	    int row = r-1;
	    for ( int col = c+1; col < board[col].length && row > 0; col++, row-- ) {
		board[row][col]--;
	    }
	}
	//lower diagonal
	if ( c != board.length-1 ) {
	    int row = r+1;
	    for ( int col = c+1; col < board[col].length && row < board.length; col++, row++ ) {
		board[row][col]--;
	    }
	}
    }
    
    public void solve() {
	
        solveH(0);
    }

    private boolean solveH(int col) {
	if ( col >= board.length ) {
	    throw new ArrayIndexOutOfBoundsException();
	}
	if ( col >= board.length-1 ) {
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
		if ( board[row][col] == -1 ) {
		    ans += "Q";
		}
		ans += board[row][col];
		if ( col != board.length-1 ) {
		    ans += ", ";
		}
	    }
	    ans += "\n";
	}
    	return ans;
    }

    public static void main( String[] args ) {
	QueenBoard q = new QueenBoard(4);
	System.out.println(q);
	q.addQueen(2,3);
	q.solve();
	
	//System.out.println( q.getCount() );
    }
}
