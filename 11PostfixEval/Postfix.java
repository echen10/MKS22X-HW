import java.util.*;
public class Postfix {
    public static double eval( String s ) {
	String[] tokens = s.split(" ");
	Stack<String> nums = new Stack<String>();

	nums.push(tokens[0]);
	nums.push(tokens[1]);
	for ( int i = 2; i < tokens.length; i++ ) {
	    if ( isOp(tokens[i]) ) {
		String a = nums.pop();
		String b = nums.pop();
		calc( tokens[i], a, b );
	    }
	    else {
		nums.push(tokens[i]);
	    }
	}
	return 0.0;
    }

    public static boolean isOp( String s ) {
	if ( s.compareTo("+") == 0 ) {
	    return true;
	}
	else { 
	    return false;
	}
    }

    public static double calc( String op, String a, String b ) {
	int x = Integer.parseInt(a);
	int y = Integer.parseInt(b);
	return 0.0;
    }
    
    public static void main( String[] args ) {
	eval("S t o p");
    }
}
