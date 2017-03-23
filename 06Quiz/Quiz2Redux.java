import java.util.*;
public class Quiz2Redux {
    public static ArrayList<String> combinations(String s) {
	ArrayList<String>words = new ArrayList<String>();
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
	else {
	    words.add("");
	}
    }

    public static void main(String[] args) {
	String s = "abcd";
	System.out.println( combinations(s) );
    }

}
