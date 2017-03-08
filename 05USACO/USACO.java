import java.io.*;
import java.util.*;

public class USACO {
    private int[][] lakeGrid;

    public int bronze(String filename) {
	try {
	    File f = new File(filename);
	    Scanner sc = new Scanner(f);
	    int rowNum = 0;
	    int colNum = 0;

	    String line1 = "";
	    while ( sc.hasNextLine() ) {
		if ( rowNum == 0 ) {
		    line1 = sc.nextLine();
		}
		rowNum++;
	    }
	    int r = line1.substring(0,1);
	}
	catch(FileNotFoundException e) {
	}
    }

    private static void stomp( int row, int col, int depth ) {
    }
	
