public class Driver {
    public static void main( String[] args) {
	Merge m = new Merge();

	int[] a1 = new int[] { 1,2 };
        String a = "";
	for ( int i = 0; i < a1.length; i++ ) {
	    a += a1[i] + ", ";
	}

	int[] a2 = new int[] { 3,4 };
	String b = "";
	for ( int i = 0; i < a2.length; i++ ) {
	    b += a2[i] + ", ";
	}

	int[] dest = new int[4];
	m.merge( a1, a2, dest );

	String c = "";
	for ( int i = 0; i < dest.length; i++ ) {
	    c += dest[i] + ", ";
	}

	System.out.println( a + "\n" + b + "\n" + c );
    }
}
