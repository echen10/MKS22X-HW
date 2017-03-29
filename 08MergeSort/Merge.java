public class Merge {
    public static void mergesort( int[] ary ) {
	
    }

    public void merge( int[] a, int[] b, int[] dest ) {

	int i = 0, j = 0, count = 0;
	while ( i < a.length && j < b.length ) {
	    if ( a[i] < b[j] ) {
		dest[count] = a[i];
		i++;
	    }
	    else {
		dest[count] = b[j];
		j++;
	    }
	    count++;
	}

	//To add the rest of the values:

	while ( i < a.length ) {
	    dest[count] = a[i];
	    i++;
	    count++;
	}
	while ( j < b.length ) {
	    dest[count] = b[j];
	    j++;
	    count++;
	}



	/*   This didn't work...
	int total = a.length + b.length;
	for ( int count = 0, i = 0, j = 0; i < a.length && j < b.length ; count++ ) {
	    if ( i == a.length-1 ) {
		for ( int m = j; j < b.length; j++ ) {
		    dest[count] = b[m];
		}
	    }
	    else if ( j == b.length-1 ) {
		for ( int n = i; i < a.length; n++ ) {
		    dest[count] = a[n];
		}
	    }
	    else if ( a[i] < b[j] ) {
		dest[count] = a[i];
		if ( i < a.length ) {
		    i++;
		}
	    }
	    else {
		dest[count] = b[j];
		if ( j < b.length ) {
		    j++;
		}
	    }
	}
	*/

    }
	
}
