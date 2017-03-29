public class Driver {
    public static void main( String[] args) {
	Merge m = new Merge();

	int[] a1 = new int[] { 1,4 };
        String a = "";
	for ( int i = 0; i < a1.length; i++ ) {
	    a += a1[i] + ", ";
	}

	int[] a2 = new int[] { 2,3 };
	String b = "";
	for ( int i = 0; i < a2.length; i++ ) {
	    b += a2[i] + ", ";
	}

	int[] dest = new int[a1.length + a2.length];
	m.merge( a1, a2, dest );

	String c = "";
	for ( int i = 0; i < dest.length; i++ ) {
	    c += dest[i] + ", ";
	}

	System.out.println( a + "\n" + b + "\n" + c );
    }
}
