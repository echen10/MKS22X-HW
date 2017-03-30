public class MyLinkedList {
    private LNode start;
    private int size;

    public MyLinkedList() {
	start = new LNode(0,null);
	size = 0;
    }

    public boolean add( int value ) {
	LNode temp = new LNode(value, start);
        start = temp;
        size++;
	return true;
    }

    public int size() {
	return size;
    }

    public int get( int index ) {
	return 0;
    }

    public int set( int index, int value ) {
	return 0;
    }

    public String toString() {
	String ans = "[";
	LNode current = start;
	int index = 0;
	while ( index < size-1 ) {
	    ans += current.value + ", ";
	    if ( current.next != null ) {
		current = current.next;
	    }
	    else {
		//ans += 0 + ", ";
	    }
	    index++;
	}
	return ans + "]";
    }


    private class LNode {
	private int value;
	private LNode next;
	
	public LNode() {
	}
	
	public LNode( int val, LNode rest ) {
	    value = val;
	    rest = null;
	}
    }

    public static void main( String[] args ) {
	MyLinkedList m = new MyLinkedList();
	m.add(3);
	m.add(7);
	m.add(1);
        System.out.println(m);
    }
    
}
