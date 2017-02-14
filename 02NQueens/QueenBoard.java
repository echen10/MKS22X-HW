public class QueenBoard{
    private int[][] board;
    private int solutionCount = -1;
    
    public QueenBoard(int size){
	board = new int[size][size];
    }

    private void addQueen(int r, int c) {
	board[r][c]++;
	
	//updateBoardState
	//right side
	for ( int col = c; col < board[col].length; col++ ) {
	    board[r][col]++;
	}
	//upper diagonal
	for ( int col = c+1, int row = r+1; col < board[col].length || row < 0; col++, row-- ) {
	    board[row][col]
	//lower diagonal
	
    }

    private void removeQueen(int r, int c) {
    }
    
    public void solve() {
	
	return solveH(0);
    }

    private boolean solveH(int col) {
	if ( col > board.size() ) {
	    return solutionCount == board.length;
	}
	for ( int row = 0; row < board[col].size; r++ ) {
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
    	return "";
    }
}
