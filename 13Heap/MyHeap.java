import java.util.*;
public class MyHeap {
    private boolean max;
    private ArrayList<String> tree;

    public MyHeap() {
	max = true;
	tree = new ArrayList<String>();
	tree.add(null);
    }
    /*
    public MyHeap( boolean type ) {
	if ( type ) {
	    max = true;
	}
	else {
	    max = false;
	}
    }
    */

    public void add( String s ) {
	tree.add(s);
    }
    /*
    public void remove() {

    }
    
    public String peek() {

    }
    */

    public String toString() {
	String ans = "";
	int count = 1;
	for ( int i = 0; i < tree.size()-1; i++ ) {
	    if ( i == Math.pow(2,count)-1 ) {
	        ans += "\n";
		count++;
	    }
	    ans += tree.get(i+1) + " ";
	    //System.out.println(tree.get(i));
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
    }
}
