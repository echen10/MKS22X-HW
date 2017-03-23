import java.util.*;
public class Quiz2Redux {
    public static ArrayList<String> combinations(String s) {
	ArrayList<String>words = new ArrayList<String>();
	words.add(s);
	help( words, s, 0 );
	Collections.sort(words);
	return words;
    }

    private static void help( ArrayList<String> words, String s, int index ) {
	if ( index < s.length() ) {
	    String part = s.substring( 0, index ) + s.substring( index+1 );
	    words.add(part);
	    help( words, part, index );
	    help( words, s, index+1 );
	}
    }
    
    /*
    public static void main(String[] args) {
	String s = "abcd";
	String s2 = "kji";
	System.out.println( combinations(s) );
	System.out.println( combinations(s2) );
    }
    */

}
