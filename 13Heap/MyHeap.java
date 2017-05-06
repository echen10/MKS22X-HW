import java.util.*;

public class MyHeap {
    private boolean max;
    private ArrayList<String> tree;

    public MyHeap() {
	max = true;
	tree = new ArrayList<String>();
	tree.add(null);
    }

    public MyHeap( boolean type ) {
        max = type;
	tree = new ArrayList<String>();
	tree.add(null);
    }

    public void add( String s ) {
	tree.add(s);
	pushUp();
    }

    public String remove() {
	String ans = tree.get( tree.size()-1 );
	tree.remove( ans );
	pushDown();
	return ans;
    }
    
    public String peek() {
	return tree.get(1);
    }

    private int compare( String a, String b ) {
	if ( max ) {
	    return a.compareTo(b);
	}
	else {
	    return b.compareTo(a);
	}
    }

    private void pushUp() {
	int count = tree.size()-1;
	while ( count > 1 ) {
	    String last = tree.get( tree.size() - 1 );
	    String parent = tree.get( (tree.size() - 1) / 2 );
	    //System.out.println(last + " | " + parent + " | " + count + " | " + tree.size());
	    
	    if ( compare(parent, last) > 0 ) {
		swap( tree.size()-1, tree.size() / 2 );
	    }
	    count = count / 2;

	    //System.out.println( "parent: " + parent + " | " + "last: " + last );
	}
    }
    
    private void pushDown() {
	
    }

    private void swap( int a, int b ) {
	String temp = tree.get(a);
	tree.set( a, tree.get(b) );
	tree.set( b, temp );
    }

    public String toString() {
	String ans = "";
	int count = 1;
	for ( int i = 0; i < tree.size()-1; i++ ) {
	    if ( i == Math.pow(2,count)-1 ) {
	        ans += "\n";
		count++;
	    }
	    ans += tree.get(i+1) + " ";
	}
	return ans;
    }

    public static void main( String[] args ) {
	MyHeap m = new MyHeap();
	m.add("C");
	m.add("B");
	m.add("A");

	System.out.println(m);
	System.out.println( "\nRemoved: " + m.remove() );
	System.out.println(m);
						   
    }
}
