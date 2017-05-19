import java.util.*;

public class MyHeap {
    private int max;
    private int size;
    private ArrayList<String> tree;

    public MyHeap() {
	max = 1;
	tree = new ArrayList<String>();
	size = 0;
	tree.add(null);
    }

    public MyHeap( boolean type ) {
	if ( type ) {
	    max = 1;
	}
	else {
	    max = -1;
	}
	tree = new ArrayList<String>();
	size = 0;
	tree.add(null);
    }

    public void add( String s ) {
	tree.add(s);
	pushUp();
    }

    public String remove() {
	String ans = tree.get( 1 );
	tree.set( 1, tree.remove( tree.size()-1 ) );
	pushDown();
	return ans;
    }
    
    public String peek() {
	return tree.get(1);
    }

    private int size() {
	return size;
    }

    private int compare( String a, String b ) {
	if ( max == 1 ) {
	    return a.compareTo(b);
	}
	else {
	    return a.compareTo(b) * -1;
	}
    }

    private void pushUp() {
	int count = tree.size()-1;
	while ( count > 1 ) {
	    String last = tree.get( tree.size() - 1 );
	    String parent = tree.get( (tree.size() - 1) / 2 );
	    //System.out.println(last + " | " + parent + " | " + count + " | " + tree.size());
	    
	    if ( compare(parent, last)*max > 0 ) {
		swap( tree.size()-1, tree.size() / 2 );
	    }
	    count = count / 2;

	    //System.out.println( "parent: " + parent + " | " + "last: " + last );
	}
    }
    
    private void pushDown() {
	int child1 tree.get();
	int child2 ;
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
	MyHeap m = new MyHeap(true);
	m.add("1");
	m.add("2");
	m.add("3");
	m.add("4");
	m.add("5");

	System.out.println(m);
	System.out.println( "\nRemoved: " + m.remove() );
	System.out.println(m);
						   
    }

}
