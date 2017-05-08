public class RunningMedian {
    private MyHeap max, min;
    private double median;

    public RunningMedian() {
	max = new MyHeap(true);
	min = new MyHeap(false);
    }

    public void add( int n ) {
        int rootMax = max.peek();
	int rootMin = min.peek();
	

	update();
    }

    public double getMedian() {
	return median;
    }

    private void update() {
	int sizeMax = max.getSize();
	int sizeMin = min.getSize();
	int rootMax = max.peek();
	int rootMin = min.peek();

	if ( sizeMax == sizeMin ) {
	    median = (rootMax + rootMin * 1.0) / 2;
	}
	else if ( sizeMax - sizeMin == 1 ) {
	    median = rootMax;
	}
	else if ( sizeMax - sizeMin == 2 ) {
	    min.add( max.remove() );
	    median = (rootMax + rootMin * 1.0) / 2;
	}
	else if ( sizeMax - sizeMin == -1 ) {
	    median = rootMin;
	}
	else {
	    max.add( min.remove() );
	    median = (rootMax + rootMin * 1.0) / 2;
	}
	    
    }

}
