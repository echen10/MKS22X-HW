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
	this.aStar = aStar;
    }

    public int compareTo( Location other ) {
	System.out.println(this.aStar);
	System.out.println(other.aStar);
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
