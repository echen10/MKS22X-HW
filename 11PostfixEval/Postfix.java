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
		calc( tokens[i], b, a );
	    }
	    else {
		nums.push(tokens[i]);
	    }
	}
	return 0.0;
    }

    public static boolean isOp( String s ) {
	if ( s.compareTo("+") == 0 ||
	     s.compareTo("-") == 0 ||
	     s.compareTo("*") == 0 ||
	     s.compareTo("/") == 0 ||
	     s.compareTo("%") == 0 ) {
	    return true;
	}
	else { 
	    return false;
	}
    }

    public static double calc( String op, String a, String b ) {
	double ans = 0.0;
	double x = Double.parseDouble(a);
	double y = Double.parseDouble(b);
	System.out.println( x + "\n" + y );

	if ( op.compareTo("+") == 0 ) {
	    ans = x + y;
	}
	else if ( op.compareTo("-") == 0 ) {
	    ans = x - y;
	}
	else if ( op.compareTo("*") == 0 ) {
	    ans = x * y;
	}
	else if ( op.compareTo("/") == 0 ) {
	    ans = x * 1.0 / y;
	}
	else if ( op.compareTo("%") == 0 ) {
	    ans = x % y;
	}

	System.out.println(ans);
	return ans;
    }
    
    public static void main( String[] args ) {
	System.out.println( eval("10 2.0 +") );
    }
}
