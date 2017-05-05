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
	String last = tree.get( tree.size()-1 );
	String parent = tree.get( 1 );

	if ( last.compareTo(parent) > 0 && ) {
	    swap(last,parent);
	}
	//System.out.println( "parent: " + parent + " | " + "last: " + last );
    }
    
    private void pushDown() {
	
    }

    private void swap( int a, int b ) {
	String temp = a;
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
	m.add("A");
	m.add("B");
	m.add("C");
	m.add("D");
	m.add("E");
	m.add("F");
	m.add("G");
	System.out.println(m);
	System.out.println( "\nRemoved: " + m.remove() );
	System.out.println( "\nRoot: " + m.peek() );
	System.out.println(m);
	System.out.println("A".compareTo("B"));
	System.out.println("B".compareTo("A"));
						   
    }
}
