public class Merge {
    public static void mergesort( int[] ary ) {
    }

    public static void merge( int[] a, int[] b, int[] dest ) {
	int i = 0, j = 0;
	int index = 0;
	while ( dest.length > a.length + b.length ) {
	    if ( a[i] > b[j] ) {
		dest[index] = b[j];
		index++;
		j++;
	    }
	    else {
		dest[index] = a[i];
		index++;
		i++;
	    }
	}
    }
	
}
