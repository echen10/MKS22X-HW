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
        int count = 0;
	for ( int i = 1; i < tree.size(); i++ ) {
	    if ( i == Math.pow(2,count) ) {
		ans += tree.get(i) + " ";
		ans += "\n";
		count++;
	    }
	    else {
		ans += tree.get(i) + " ";
	    }
	}
	return ans;
    }

    public static void main( String[] args ) {
	MyHeap m = new MyHeap();
	System.out.println(m);
	m.add("A");
	m.add("B");
    }
}
