public class Merge {
    public static void mergesort( int[] ary ) {
    }

    public static void merge( int[] a, int[] b, int[] dest ) {
	int i = 0, j = 0;
	int total = a.length + b.length - 2;
	int[] d = new int[total];

	for ( int count = 0; i+j < total;  ) {
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
