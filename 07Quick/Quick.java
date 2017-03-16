public class Quick {
    public static int part( int[] data, int start, int end ) {
	int piv = data[ (int)( Math.random()*(end-start+1) ) + start ];
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
	System.out.println("piv= "+start);
	return start;
    }

    private static void swap( int[] data, int a, int b ) {
	int temp = data[a];
	data[a] = data[b];
	data[b] = temp;
    }

    /*
    public static int quickselect( int[]data, int k ) {
    while ( part( data, start, end ) > k ) {
	int piv = part( data, start, end );
	if ( piv == k ) {
	    return data[k];
	}
    }
    */

}
