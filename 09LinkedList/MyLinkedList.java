import java.util.*;
public class MyLinkedList {
    private LNode start, end;
    private int size;

    public MyLinkedList() {
    }

    public boolean add( int value ) {

	//LNode temp = new LNode(value);
	//this.start.prev = temp;
	//temp.next = this.start;

        size++;
	return true;
    }

    public int size() {
	return size;
    }

    public int get( int index ) {
	return getNthNode(index).value;
    }

    public int set( int index, int value ) {
	LNode node = getNthNode(index);
	int temp = get(index);
	node.value = value;
	return temp;
    }

    private LNode getNthNode( int index ) {
	if ( index < 0 || index >= size ) {
	    throw new IndexOutOfBoundsException();
	}
	LNode current = start;
	int count = index;
	while ( current.next != null && count != 0 ) {
	    current = current.next;
	    count--;
	}
	return current;
    }

    private void remove( LNode target ) {
	if ( this.start == target && this.end == target ) {
	    //target.value = null;
	}
	else if ( this.start == target ) {
	    target.next = start;
	    target.next.prev = null;
	}
	else if ( this.end == target ) {
	    target.prev = end;
	    target.prev.next = null;
	}
	else {
	    target.next.prev = target.prev;
	    target.prev.next = target.next;
	}
    }

    private void addAfter( LNode location, LNode toBeAdded ) {
	toBeAdded.prev = location;
	toBeAdded.next = location.next;
	location.next.prev = toBeAdded;
	location.next = toBeAdded;
    }
	
	

    public String toString() {
	String ans = "[";
	LNode current = start;
	int count = 0;
	while ( count < size-1 ) {
	    ans += current.value + ", ";
	    if ( current.next != null ) {
		current = current.next;
	    }
	    count++;
	}
	return ans + "]";
    }


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
    }

    public static void main( String[] args ) {
	MyLinkedList m = new MyLinkedList();
	m.add(1);
	//m.add(2);
	//m.add(3);
	//m.add(4);
        System.out.println(m);

    }
    
}
