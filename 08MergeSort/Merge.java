public class Merge {
    public static void mergesort( int[] ary ) {
    }

    public void merge( int[] a, int[] b, int[] dest ) {
	int i = 0, j = 0;
	int index = 0;
	int[] d = new int[ a.length + b.length ];
	while ( dest.length-2 < i+j ) {
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
