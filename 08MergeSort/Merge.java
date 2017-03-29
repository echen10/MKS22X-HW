public class Merge {
    public static void mergesort( int[] ary ) {
    }

    public void merge( int[] a, int[] b, int[] dest ) {
	int i = 0, j = 0;
<<<<<<< HEAD
	int index = 0;
	int[] d = new int[ a.length + b.length ];
	while ( dest.length-2 < i+j ) {
=======
	int total = a.length + b.length - 2;
	int[] d = new int[total];

	for ( int count = 0; i+j < total;  ) {
>>>>>>> 985a9cdc0e70d82233b5889e3b23baec9b1fd8cf
	    if ( a[i] > b[j] ) {
		d[count] = b[j];
		count++;
		j++;
	    }
	    else {
		d[count] = a[i];
		count++;
		i++;
	    }
	}

	String ans = "ANS: ";
	for ( int k = 0; k < d.length; k++ ) {
	    ans += d[k] + ", ";
	}
	System.out.println(ans);
    }
	
}
