public class Recursion {
    public static String name() {
	return "Chen,Evan";
    }

    private static boolean isCloseEnough( double a, double b ) {
	double diff = Math.abs(a-b);
	double avg = (a + b) / 2.0;
	if ( (diff / avg) <= Math.pow(10,-10) ) {
	    return true;
	}
	return false;
    }

    private static double calc( double n, double guess ) {
	if ( isCloseEnough(n, guess*guess) ) {
	    return guess;
	}
	else {
	    double betterGuess = ( n / guess + guess ) / 2.0;
	    return calc( n, betterGuess );
	}
    }
    
    public static double sqrt( double n ) {
	if ( n < 0 ) {
	    throw new IllegalArgumentException();
	}
	if ( n == 0.0 ) {
	    return 0.0;
	}
	return calc(n, n/2);
    }

    public static void main(String[] args) {
	Recursion r = new Recursion();
	System.out.println(r.sqrt(100));
    }
}
