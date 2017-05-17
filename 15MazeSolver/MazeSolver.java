public class MazeSolver {
    private Maze board;

    public MazeSolver( String filename ) {
    }
    public MazeSolver( String filename, boolean animate ) {
    }

    public void solve() {
	solve(1);
    }

    public void solve( int style ) {
	if ( style == 0 ) {
	    StackFrontier frontier = new StackFrontier();
	}
	else if ( style == 1 ) {
	    QueueFrontier frontier = new QueueFrontier();
	}
	else if ( style == 2 ) {
	    PriorityQueueFrontier frontier = new PriorityQueueFrontier(true);
	}
	else {
	    PriorityQueueFrontier frontier = new PriorityQueueFrontier(false);
	}

	//Add the starting location, run the frontier until end is found
    }

    public String toString() {
	return "";
    }

}
