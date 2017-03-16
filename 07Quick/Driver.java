public class Driver {
    public static void main( String[] args ) {
	Quick q = new Quick();
	int[] ary = new int[] { 1,2,3,3,3,3 };
	String ans1 = "";
	String ans2 = "";
	for ( int i = 0; i < ary.length; i++ ) {
	    ans1 += ary[i] + ", ";
	}
	q.part( ary, 0, ary.length-1 );
	for ( int i = 0; i < ary.length; i++ ) {
	    ans2 += ary[i] + ", ";
	}
	System.out.println(ans1);
	System.out.println(ans2);
    }
}
