public class Location implements Comparable<Location> {
    private int row;
    private int col;
    private Location previous;
    private int distToStart;
    private int distToGoal;
    private boolean aStar;

    public Location( int r, int c, Location prev, int disStart, int disEnd ) {
	row = r;
	col = c;
	previous = prev;
	distToStart = disStart;
	distToGoal = disEnd;
    }

    public Location( int r, int c, Location prev, int disStart, int disEnd, boolean aStar ) {
	row = r;
	col = c;
	previous = prev;
	distToStart = disStart;
	distToGoal = disEnd;
	aStar = aStar;
    }

    public int compareTo( Location other ) {
	if ( aStar ) {
	    int first = this.distToGoal + this.distToStart;
	    int second = other.distToGoal + other.distToStart;
	    return first - second;
	}
	else {         //bestFirst
	    int first = this.distToGoal;
	    int second = other.distToGoal;
	    return first - second;
	}
    }

}
