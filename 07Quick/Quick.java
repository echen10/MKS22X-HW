public class Quick {
    public static int part( int[] data, int start, int end ) {
	int piv = (int)( Math.random()*(end-start+1) ) + start;
	int v = data[piv];
	swap(data, piv, start);

	int i = start;
	int j = end;
	while ( i <= j ) {
	    if ( data[i] < piv ) {
		i++;
	    }
	    else {
		swap(data, i, j);
		j--;
	    }
	}
	return i;
	//swap(data, i, j);
	
	/*
	while ( i <= gt ) {
	    if ( data[i] < v ) {
		i++;
	    }
	    else if ( data[i] < v ) {
		swap(data, i, lt);
		i++;
		lt++;
	    }
	    else {
		swap(a,i,lt);
		gt--;
	    }
	}
	*/
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
