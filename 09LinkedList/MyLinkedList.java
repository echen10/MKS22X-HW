public class MyLinkedList {
    private LNode start, end;
    private int size;

    public MyLinkedList() {
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
	LNode node = getNode(index);
	return node.value;
    }

    public int set( int index, int value ) {
	return 0;
    }

    private LNode getNode( int index ) {
	if ( index < 0 || index >= size ) {
	    throw new IndexOutOfBoundsException();
	}
	LNode current = start;
	while ( count != index ) {
	    current = current.nextNode;
	    count++;
	}
	return current;
    }

    private void remove( LNode node ) {
	if ( HEAD && TAIL ) {
	    
	}
	if ( HEAD ) {
	    node.nextNode = start;
	    node.nextNode.prevNode = null;
	}
	if ( TAIL ) {
	    node.prevNode = end;
	    node.prevNode.nextNode = null;
	}
    }
	
	

    public String toString() {
	String ans = "[";
	LNode current = start;
	int count = 0;
	while ( count < size-1 ) {
	    ans += current.value + ", ";
	    if ( current.nextNode != null ) {
		current = current.nextNode;
	    }
	    count++;
	}
	return ans + "]";
    }


    private class LNode {
	private int value;
	private LNode nextNode, prevNode;
	
	public LNode() {
	}
	
	public LNode( int val, LNode prev, LNode next ) {
	    value = val;
	    nextNode = next;
	    prevNode = prev;
	}

	public String toString() {
	    String ans = "";
	    if ( prevNode == null ) {
		ans += "(null)";
	    }
	    else {
		ans += prev.value;
	    }
	    ans += "(" + value ")";
	    if ( nextNode == null ) {
		ans += "(null)";
	    }
	    else {
		ans += "(" + value ")";
	    }
		    
	    return ans;
	}
    }

    public static void main( String[] args ) {
	MyLinkedList m = new MyLinkedList();
	m.add(3);
	m.add(7);
	m.add(1);
	m.add(2);
        System.out.println(m);
    }
    
}
