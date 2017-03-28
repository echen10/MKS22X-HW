public class MyLinkedList {
    private LNode start, end;
    private int size;

    public MyLinkedList() {
    }

    public boolean add( int value ) {
	LNode temp = new LNode(value, this.start);
	this.size++;

    }

    public int size() {
	return size;
    }


    private class LNode {
	private int value;
	private LNode next, start;
	
	public LNode() {
	}
	
	public LNode( int val, LNode ln ) {
	    value = val;
	    start = ln;
	    next = null;
	}
    }
    
}
