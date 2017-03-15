public class Quick {
    public static int part( int[] data, int start, int end ) {
	int piv = data[ (int)( Math.random() * data.length ) ];
	int pivIndex = 0;
	int last = data.length;
	int[] temp = new int[data.length]; //change to in place
	for ( int i = start; i < end; i++ ) {
	    if ( data[i] < piv ) {
		temp[i] = data[i];
	    }
	    if ( data[i] > piv ) {
		temp[last] = data[i];
		last--;
	    }
	    if ( data[i] == piv ) {
		pivIndex = data[i];
	    }
	}
	return pivIndex;
	
	
    }
    
    public static void main( String[] args ) {
	Quick q = new Quick();
	int[] ary = new int[] { 1,2,3,4,5 };
	q.part( ary, 0, 4 );
    }

}
