public class LNode {
    private int value;
    private LNode next, prev;
    
    public LNode( int value ) {
	this.value = value;
    }
    
    public String toString() {
	String ans = "";
	if ( prev == null ) {
	    ans += "(null)";
	}
	else {
	    ans += "(" + prev.value + ")";
	}
	ans += "(" + value + ")";
	if ( next == null ) {
	    ans += "(null)";
	}
	else {
	    ans += "(" + next.value + ")";
	}
	
	return ans;
    }

    public static void main( String[] args ) {
	LNode l = new LNode(4);
	l.prev = new LNode(3);
	l.next = new LNode(5);
	System.out.println(l);
    }
}
