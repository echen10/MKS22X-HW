public class QueenBoard{
    private int[][] board;
    private int solutionCount;
    
    public QueenBoard(int size){
	board = new int[size][size];
    }

    public boolean solve() {
	return solveH(0);
    }

    private boolean solveH(int col) {
	return false;
    }

    public int getSolutionCount() {
    	return -1;
    }

    public String toString() {
    	return "";
    }
}
