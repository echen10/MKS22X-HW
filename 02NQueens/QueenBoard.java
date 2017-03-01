public class QueenBoard{
    private int[][] board;
    private int solutionCount = -1;
    
    public QueenBoard(int size) {
	board = new int[size][size];
    }

    private void addQueen(int r, int c) {
	
	//updateBoardState

	//right side
	for ( int col = c+1; col < board.length; col++ ) {
	    board[r][col]++;
	}
	
	//upper diagonal
	int row1 = r-1;
	for ( int col = c+1; col < board.length && row1 > 0; col++, row1-- ) {
	    board[row1][col]++;
	}
	
	//lower diagonal
	int row2 = r+1;
	for ( int col = c+1; col < board.length && row2 < board.length; col++, row2++ ) {
	    board[row2][col]++;
	}

	board[r][c] = -1;
    }

    private void removeQueen(int r, int c) {

	//updateBoardState
	
	//right side
	for ( int col = c+1; col < board.length; col++ ) {
	    board[r][col]--;
	}
	
	//upper diagonal
	int row1 = r-1;
	for ( int col = c+1; col < board.length && row1 > 0; col++, row1-- ) {
	    board[row1][col]--;
	}
	
	//lower diagonal
	int row2 = r+1;
	for ( int col = c+1; col < board.length && row2 < board.length; col++, row2++ ) {
	    board[row2][col]--;
	}

	board[r][c] = 0;
    }
    
    public void solve() {
	if ( !( board.length == 2 || board.length == 3 ) ) {
	    solveH(0);
	}
    }
    
    private boolean solveH(int col) {

	if ( col >= board.length ) {
	    return true;
	}
	
	/*
	String ans = "";
	for ( int i = 0; i < board.length; i++ ) {
	    for ( int j = 0; j < board.length; j++ ) {
	        ans += board[i][j] + " ";
	    }
	    ans += "\n";
	}
	System.out.println(ans);
	*/
	
	for ( int row = 0; row < board.length; row++ ) {
	    if ( board[row][col] == 0 ) {
		//System.out.println(board[row][col]);
		addQueen(row,col);
		if ( solveH(col+1) ) {
		    return true;
		}
		removeQueen(row,col);
	    }
	}
	return false;
    }

    public void countSolutions() {
    }
    
    public int getCount() {
    	return solutionCount;
    }

    public String toString() {
	String ans = "";
	for ( int row = 0; row < board.length; row++ ) {
	    for ( int col = 0; col < board.length; col++ ) {
		if ( board[row][col] == -1 ) {
		    ans += "Q ";
		}
	        else {
		    ans += "_ ";
		}
	    }
	    ans += "\n";
	}
    	return ans;
    }

    public static void main( String[] args ) {
	QueenBoard q = new QueenBoard(4);
	System.out.println(q);
	q.solve();
	System.out.println(q);
    }

}
