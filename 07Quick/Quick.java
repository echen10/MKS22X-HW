public class Quick {
    public static int part( int[] data, int start, int end ) {
	int piv = data[ (int)( Math.random() * ( end-start ) ) ];
	while ( start < end ) {
	    while ( data[start] < piv ) {
		start++;
	    }
	    while ( data[end] > piv ) {
		end--;
	    }
	    if ( start < end ) {
		swap( data, start, end );
	    }
	}
	return start;
    }

    private static void swap( int[] data, int a, int b ) {
	int temp = data[a];
	data[a] = data[b];
	data[b] = temp;
    }
    
    public static void main( String[] args ) {
	Quick q = new Quick();
	int[] ary = new int[] { 6,3,2,1,9 };
	for ( int i = 0; i < ary.length; i++ ) {
	    System.out.println(ary[i]);
	}
	q.part( ary, 0, 4 );
	for ( int i = 0; i < ary.length; i++ ) {
	    System.out.println(ary[i]);
	}
    }

}
