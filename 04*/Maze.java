import java.util.*;
import java.io.*;

public class Maze {
    private char[][] maze;
    private boolean animate;

    public Maze(String filename) {
	File file = new File(filename);
	try {
	    Scanner in = new Scanner( new FileReader(filename) );

	    String stuff = "";
	    int row;
	    int col = 0;
	    while ( in.hasNextLine() ) {
		stuff += in.nextLine();
		stuff.toCharArray();
		row = stuff.length();
		System.out.println(row);
		col++;
	    }
	}
	catch( FileNotFoundException e ) {
	}
    
	//maze = new char[][];
	animate = false;
    }


    public void setAnimate(boolean b) {
        animate = b;
    }

    private void wait(int millis){ //ADDED SORRY!
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }

    public void clearTerminal(){
	System.out.println("\033[2J\033[1;1H");
    }

    public boolean solve() {
	int startx = 0, starty = 0;

	//Initialize startx and starty with the location of the S. 
	maze[startx][starty] = ' ';//erase the S, and start solving!
	return solve(startx,starty);
    }

    private boolean solve(int x, int y) {
        if ( animate ) {
            System.out.println("\033[2J\033[1;1H"+this);
            //wait(20);
        }
 
	

        return false; //so it compiles
    }

    public static void main(String[]args){
        Maze f;
        f = new Maze("data1.dat");//true animates the maze.
        
        f.setAnimate(true);
        f.solve();

        System.out.println(f);
    }

}


