import java.util.*;
import java.io.*;

public class Maze {
    private char[][] maze;
    private boolean animate;

    public Maze(String filename) {
	File maze = new File(input);
	Scanner in = new Scanner(text);
	int lineNumber = 1;
	while ( in.hasNextLine() ) {
	    String line = in.nextLine();
	}
	    
	maze = new char[][];
	animate = false;
    }

    public void setAnimate(boolean b) {
        animate = b;
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
            wait(20);
        }
        //COMPLETE SOLVE
        return false; //so it compiles
    }

}


